CREATE TABLE account.account (
  id bigserial NOT NULL PRIMARY KEY,
  number_account character varying(10) NOT NULL,
  customer character varying(75) NOT NULL,
  balance numeric(16,2)  
);