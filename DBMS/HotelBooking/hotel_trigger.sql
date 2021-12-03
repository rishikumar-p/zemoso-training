CREATE DEFINER = CURRENT_USER TRIGGER `mydb`.`Customer_BEFORE_INSERT` BEFORE INSERT ON `Customer` FOR EACH ROW
BEGIN
	IF(select count(customer_id) from Hotel where Hotel.customer_id = new.customer_id)
	THEN
		update Hotel
		set Customer.customerPoints = 1000 + Customer.customerPoints;
	END IF;
END;