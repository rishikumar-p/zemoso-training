CREATE DEFINER = CURRENT_USER TRIGGER `mydb`.`Ticket_BEFORE_INSERT` BEFORE INSERT ON `Ticket` FOR EACH ROW
BEGIN
	IF (select count(Ticket.train_number) from Ticket where Ticket.customerId = new.customer_id)
    THEN

		IF ( (select Ticket.source_start_time from Ticket where Ticket.train_number = new.train_number) < new.source_start_time AND
				(select Ticket.destination_end_time from Ticket where Ticket.train_number = new.train_number) > new.source_time)
		THEN
			RAISE_APPLICATION_ERROR(-20001,'Cannot Book Ticket');
		END IF
	END IF;
END