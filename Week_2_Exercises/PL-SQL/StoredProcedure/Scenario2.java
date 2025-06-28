CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  deptId IN NUMBER,
  bonusPercent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * bonusPercent / 100)
  WHERE DepartmentID = deptId;

  COMMIT;
END;

EXEC UpdateEmployeeBonus(10, 5);  -- Adds 5% bonus to employees in dept 10

