CREATE TABLE IF NOT EXISTS ITEMS
(
    ID BIGSERIAL PRIMARY KEY NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    PRICE DOUBLE PRECISION NOT NULL,
    DESCRIPTION TEXT
)