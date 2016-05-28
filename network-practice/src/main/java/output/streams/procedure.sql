DELIMITER $$

DROP PROCEDURE IF EXISTS `test`.`getEmpName` $$

CREATE PROCEDURE `test`.`getEmpName` 
   (IN EMP_ID INT, OUT EMP_FIRST VARCHAR(255))
BEGIN
   SELECT username INTO EMP_FIRST
   FROM IdentityBean
   WHERE ID = EMP_ID;
END $$

DELIMITER ;