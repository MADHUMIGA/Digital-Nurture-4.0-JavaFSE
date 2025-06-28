BEGIN
  FOR rec IN (
    SELECT CustomerID, DueDate FROM Loans 
    WHERE DueDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || rec.CustomerID ||
                         ' has a loan due on ' || TO_CHAR(rec.DueDate, 'DD-MON-YYYY'));
  END LOOP;
END;

