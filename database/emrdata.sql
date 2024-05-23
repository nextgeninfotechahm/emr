use emr;
-- Create master list of races
insert into races(name,description) values ('White','White');
insert into races(name,description) values ('Black','Black or African American');
insert into races(name,description) values ('Asian','Asian');
insert into races(name,description) values ('American Indian','American Indian or Alaska Native');
insert into races(name,description) values ('Native Hawaiian','Native Hawaiian or Other Pacific Islander');
insert into races(name,description) values ('Other','Other');

-- Create master list of ethnicities
insert into ethnicities(name,description) values ('White','White');
insert into ethnicities(name,description) values ('Black','Black or African American');
insert into ethnicities(name,description) values ('Asian','Asian');
insert into ethnicities(name,description) values ('American Indian','American Indian or Alaska Native');
insert into ethnicities(name,description) values ('Native Hawaiian','Native Hawaiian or Other Pacific Islander');
insert into ethnicities(name,description) values ('Other','Other');

-- Create master list of statuses
insert into statusids(name,description) values ('Active','Active');
insert into statusids(name,description) values ('Inactive','Inactive');
insert into statusids(name,description) values ('Dead','Dead');


-- Create master list of genders
insert into genders(name,description) values ('Male','Male');
insert into genders(name,description) values ('Female','Female');
insert into genders(name,description) values ('Non-Binary','Non-Binary');
insert into genders(name,description) values ('Other','Other');

-- Create master list of idtypes
insert into idtypes(name,description,folderPath) values ('Drivers License','Drivers License','dl');
insert into idtypes(name,description,folderPath) values ('Passport','Passport','pp');
insert into idtypes(name,description,folderPath) values ('State Id','State Id','si');
insert into idtypes(name,description,folderPath) values ('Aadhar Card','Aadhar Card','ac');
insert into idtypes(name,description,folderPath) values ('PAN','PAN','pan');
insert into idtypes(name,description,folderPath) values ('Photo','Photo','ph');


-- Create master list of docTypes
insert into docTypes(name,description) values ('Lab','Lab Results');
insert into docTypes(name,description) values ('Imaging','XRAY, MRI etc..');
insert into docTypes(name,description) values ('ECG','ECG Chart')
insert into docTypes(name,description) values ('Report','Diagnostic Reports');
insert into docTypes(name,description) values ('Other','Other documents');



-- Create master list of Roles
insert into roles(name,description,active) values ('Admin','Administrator',true);
insert into roles(name,description,active) values ('Front Desk','Front Desk operator',true);
insert into roles(name,description,active) values ('Physician','Physician',true);
insert into roles(name,description,active) values ('Technician','Technician',true);
insert into roles(name,description,active) values ('Nurse','Nurse',true);
insert into roles(name,description,active) values ('Physician Assistant','Physician Assistant',true);
insert into roles(name,description,active) values ('Admin Staff','Admin Staff',true);
insert into roles(name,description,active) values ('Pharmacist','Pharmacist',true);
insert into roles(name,description,active) values ('Manager','Manager',true);
insert into roles(name,description,active) values ('Patient','Patient',true);
insert into roles(name,description,active) values ('Patient Family','Patient Family',true);
insert into roles(name,description,active) values ('Lab Assistant','Lab Assistant',true);
insert into roles(name,description,active) values ('Other','Other',true);
