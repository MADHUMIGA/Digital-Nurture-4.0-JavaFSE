CREATE OR REPLACE PROCEDURE TransferFunds(
  fromAccount IN NUMBER,
  toAccount IN NUMBER,
  amount IN NUMBER
) AS
  currentBalance NUMBER;
BEGIN
  -- Get balance of source account
  SELECT Balance INTO currentBalance
  FROM Accounts
  WHERE AccountID = fromAccount;

  -- Check if sufficient balance
  IF currentBalance < amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
  END IF;

  -- Deduct from source
  UPDATE Accounts
  SET Balance = Balance - amount
  WHERE AccountID = fromAccount;

  -- Add to destination
  UPDATE Accounts
  SET Balance = Balance + amount
  WHERE AccountID = toAccount;

  COMMIT;
END;


EXEC TransferFunds(101, 202, 500);

