DROP TABLE IF EXISTS CLIENT;
CREATE TABLE CLIENT (
                        id_client INT AUTO_INCREMENT  PRIMARY KEY,
                        first_name VARCHAR(50) NOT NULL,
                        last_name VARCHAR(50) NOT NULL,
                        email VARCHAR(50) NOT NULL
);

INSERT INTO CLIENT (first_name,last_name, email) VALUES('Szymon','Bilinski','szymon.zsp5@gmail.com');
