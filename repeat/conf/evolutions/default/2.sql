# --- Sample dataset

# --- !Ups

insert into user (email,name,password,role) values ( 'admin@recruit.com', 'Randy Recruit', 'password', 'admin' );

insert into user (email,name,password,role) values ( 'manager@recruit.com', 'Bob Manager', 'password', 'manager' );

insert into user (email,name,password,role) values ( 'client@recruit.com', 'Charlie Customer', 'password', 'client' );

insert into cv (CV_ID, CV_NAME, OBJECTIVE, EDUCATION, WORK_EXPERIENCE) values ( 1, 'John Micko', 'Good worker', 'BSc in Computer Science' , '3 years at Google');
insert into cv (CV_ID, CV_NAME, OBJECTIVE, EDUCATION, WORK_EXPERIENCE) values ( 2, 'Sam Smith', 'Great communicator', 'B.A. in History' , 'None');
insert into cv (CV_ID, CV_NAME, OBJECTIVE, EDUCATION, WORK_EXPERIENCE) values ( 3, 'Ricky Toto', 'Good work ethic', 'B.A. in Politics' , '1 year at Post Office');

insert into address (add_id, add_name, eir_code) values ( 1, '13 Flower Avenue', 'LA312');
insert into address (add_id, add_name, eir_code) values ( 2, '45 Happyroads', 'E56GJ');
insert into address (add_id, add_name, eir_code) values ( 3, '67 Fasten Drive', 'R43AF');

insert into client (id, name, description, ADDRESS_ADD_ID , CV_CV_ID ) values ( 1, 'John Micko', 'Love to communicate', 1 , 1);
insert into client (id, name, description, ADDRESS_ADD_ID , CV_CV_ID ) values ( 2, 'Sam Smith', 'Happy to help when needed!', 2 , 2);
insert into client (id, name, description, ADDRESS_ADD_ID , CV_CV_ID ) values ( 3, 'Ricky Toto', 'Diligent and great and leader', 3 , 3);