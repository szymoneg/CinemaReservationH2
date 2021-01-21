CREATE TABLE CLIENT (
                        id_client INT AUTO_INCREMENT  PRIMARY KEY,
                        first_name VARCHAR(50) NOT NULL,
                        last_name VARCHAR(50) NOT NULL,
                        email VARCHAR(50) NOT NULL
);

CREATE TABLE MOVIE (
                       id_movie INT AUTO_INCREMENT  PRIMARY KEY,
                       title VARCHAR(50) NOT NULL,
                       category VARCHAR(50) NOT NULL,
                       year_production VARCHAR(50) NOT NULL
);


CREATE TABLE ROOM(
                     id_room INT AUTO_INCREMENT PRIMARY KEY,
                     number_room VARCHAR(4) NOT NULL,
                     normal_seats ARRAY,
                     vip_seats ARRAY
);

CREATE TABLE REPERTOIRE (
                            id_repertoire INT AUTO_INCREMENT  PRIMARY KEY,
                            id_movie INT NOT NULL,
                            id_room INT NOT NULL,
                            time TIME NOT NULL,
                            foreign key (id_movie) references MOVIE(id_movie),
                            foreign key (id_room) references ROOM(id_room)
);
