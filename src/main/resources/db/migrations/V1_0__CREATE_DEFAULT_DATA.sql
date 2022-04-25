CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS clients (
    uuid uuid DEFAULT uuid_generate_v4(),
    password VARCHAR NOT NULL,
    email VARCHAR,

    PRIMARY KEY(uuid)
);
