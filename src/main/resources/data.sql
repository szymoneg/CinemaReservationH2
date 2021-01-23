-- CREATE TABLE CLIENT (
--                         id_client INT AUTO_INCREMENT  PRIMARY KEY,
--                         first_name VARCHAR(50) NOT NULL,
--                         last_name VARCHAR(50) NOT NULL,
--                         email VARCHAR(50) NOT NULL
-- );
--
-- CREATE TABLE MOVIE (
--                        id_movie INT AUTO_INCREMENT  PRIMARY KEY,
--                        title VARCHAR(50) NOT NULL,
--                        category VARCHAR(50) NOT NULL,
--                        year_production VARCHAR(50) NOT NULL
-- );
--
--
-- CREATE TABLE ROOM(
--                      id_room INT AUTO_INCREMENT PRIMARY KEY,
--                      number_room VARCHAR(4) NOT NULL,
-- );
--
-- CREATE TABLE REPERTOIRE (
--                             id_repertoire INT AUTO_INCREMENT  PRIMARY KEY,
--                             id_movie INT NOT NULL,
--                             id_room INT NOT NULL,
--                             time TIME NOT NULL,
--                             foreign key (id_movie) references MOVIE(id_movie),
--                             foreign key (id_room) references ROOM(id_room)
-- );
--
-- CREATE TABLE SEATS(
--                     id_seat INT AUTO_INCERMENT PRIMARY KEY,
--                     id_room INT NOT NULL,
--                     num_seat VARCHAR(4) NOT NULL,
--                     type_seat BOOLEAN NOT NULL,
--                     foreign key (id_room) references ROOM(id_room)
-- );

INSERT INTO CLIENT (first_name,last_name, email) VALUES('Szymon','Bilinski','szymon.zsp5@gmail.com');

INSERT INTO MOVIE (title,category,year_production) VALUES ('Kiler','komedia','1992');
INSERT INTO MOVIE (title,category,year_production) VALUES ('Katyn','dramat','2005');
INSERT INTO MOVIE (title,category,year_production) VALUES ('Pewnego razu w hollywood','komedia','2019');
INSERT INTO MOVIE (title,category,year_production) VALUES ('Harry Potter','fantastyczny','2001');

INSERT INTO ROOM (number_room,normal_seats,vip_seats) VALUES ('A01',(1,2),(11,22,33));

INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A01',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A02',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A03',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A04',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A05',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'A06',FALSE);

INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B01',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B02',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B03',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B04',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B05',FALSE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'B06',FALSE);

INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'V01',TRUE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'V02',TRUE);
INSERT INTO SEATS (id_room,num_seat,type_seat) VALUES (1,'V03',TRUE);

INSERT INTO REPERTOIRE (id_movie,id_room,time) VALUES (1,1,'12:00');




