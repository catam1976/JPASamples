insert into users (id, account_name, activated, activation_code, creation_date, email, first_name, is_admin, last_name, password) values (1, 'admin', 1, '611caf68-3758-441d-88b7-cebcf4450122', now(), 'admin@fortech.ro', 'Admin', 1, 'Admin', 'admin');
insert into users (id, account_name, activated, activation_code, creation_date, email, first_name, is_admin, last_name, password) values (2, 'caveat', 1, 'f64d6b78-1bba-49d6-8c02-57e84bf164ac', now(), 'caveat@fortech.ro', 'Caveat', 0, 'Emptor', 'caveat');

insert into categories (id, parent_category, creation_date, description, name) values (1, null, now(),'Books description','Books');
insert into categories (id, parent_category, creation_date, description, name) values (2, 1,    now(),'According to the Romance Writers of America, two basic elements comprise every romance novel: a central love story and an emotionally-satisfying and optimistic ending.','Romance');
insert into categories (id, creation_date, description, name, parent_category) values (3,now(),'Proper history books, not historical fiction, about any period, event, area or topic you like. Just well-written, well-researched, informative and interesting books for historians, history students and history enthusiasts','History',1);
insert into categories (id, creation_date, description, name, parent_category) values (4,now(),'Politics can be observed in other group interactions, including corporate, academic, and religious institutions. It consists of `social relations involving authority or power` and refers to the regulation of public affairs within a political unit, and to the methods and tactics used to formulate and apply policy.','Political',1);
insert into categories (id, creation_date, description, name, parent_category) values (5,now(),'Paranormal romance is a sub-genre of the romance novel related to paranormal fiction. Paranormal romance focuses on romance and includes elements beyond the range of scientific explanation, blending together themes from the genres of urban fantasy, traditional fantasy, science fiction, or horror.', 'Paranormal romance books',2);
insert into categories (id, creation_date, description, name, parent_category) values (6,now(),'Smart tech description','Smart tech',null);
insert into categories (id, creation_date, description, name, parent_category) values (7,now(),'Smart toys description','Smart toys',6);
insert into categories (id, creation_date, description, name, parent_category) values (8,now(),'Smart car description','Smart car',6);
insert into categories (id, creation_date, description, name, parent_category) values (9,now(),'Smart health description','Smart health',6);
insert into categories (id, creation_date, description, name, parent_category) values (10,now(),'Smart home description','Smart home',6);
insert into categories (id, creation_date, description, name, parent_category) values (11,now(),'Smartwatch description','Smartwatch',6);
insert into categories (id, creation_date, description, name, parent_category) values (12,now(),'Fashion description','Fashion',null);
insert into categories (id, creation_date, description, name, parent_category) values (13,now(),'Women`s fashion description','Women`s fashion',12);
insert into categories (id, creation_date, description, name, parent_category) values (14,now(),'Men`s fashion description','Men`s fashion',12);
insert into categories (id, creation_date, description, name, parent_category) values (15,now(),'Kid`s fashion description','Kid`s fashion',12);
insert into categories (id, creation_date, description, name, parent_category) values (16,now(),'Drones','Drones',7);
insert into categories (id, creation_date, description, name, parent_category) values (17,now(),'Electrical vehicle','Electrical vehicle',8);

insert into items (id, description, start_date, initial_price, name, end_date) values (1, 'The publication of Darwin`s The Origin of Species in 1859 marked a dramatic turning point in scientific thought. The volume had taken Darwin more than twenty years to publish, in part because he envisioned the storm of controversy it was certain to unleash. ', PARSEDATETIME('12-06-2016', 'dd-MM-yyyy'), 6, 'The Origin of Species', PARSEDATETIME('12-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (2, 'As a Part-time PI and fulltime grim reaper, Charley Davidson has asked a lot of questions throughout her life: Why can I see dead people? Who is the hot supernatural entity following me? How do I get gum out of my sister`s hair before she wakes up? ', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 12, 'The Curse of Tenth Grave', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (3, 'Discovered in the attic in which she spent the last years of her life, Anne Frank`s remarkable diary has since become a world classic�a powerful reminder of the horrors of war and an eloquent testament to the human spirit.', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 8, 'The Diary of a Young Girl', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (4, 'With 0.3MP camera can Video/Photograph,3 flight speed mode,Low voltage alarm,With LED light for night flight', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 189, 'Cheerson CX-10C', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (5, 'Headless/IOC function. Usually, the forward direction of a flying multi-rotor is the same as the nose direction. By using Headless/IOC, the forward direction has nothing to do with nose direction. This lessens the steepness of the learning curve and allows the pilot to enjoy flight while slowly learning each specific orientation of the quadcopter.Equipped with the latest 6-axis flight control systems, 3D lock, More scheduled flight, operating more to the force!Equipped with HD camera to take photos and videos while flying! Bring a new perspective to your photos and videos from the air.', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 289, 'Cheerwing Syma X5SW-V3', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (6, 'WRIST HEART RATE MONITOR: Accurate wrist-based heart rate monitor with personalized training guidance to reach your fitness goals', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 289, 'Polar A360 Fitness Tracker with Wrist Heart Rate Monitor', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (7, 'ACTIVITY TRACKER: Waterproof fitness monitor motivates you to reach your daily goal by tracking your steps, distance, and calories burned 24/7', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 319, 'Polar A300 Fitness Tracker and Activity Monitor', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (8, 'The publication of Darwin`s The Origin of Species in 1859 marked a dramatic turning point in scientific thought. The volume had taken Darwin more than twenty years to publish, in part because he envisioned the storm of controversy it was certain to unleash. ', PARSEDATETIME('12-06-2016', 'dd-MM-yyyy'), 6, 'The Origin of Species', PARSEDATETIME('12-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (9, 'As a Part-time PI and fulltime grim reaper, Charley Davidson has asked a lot of questions throughout her life: Why can I see dead people? Who is the hot supernatural entity following me? How do I get gum out of my sister`s hair before she wakes up? ', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 12, 'The Curse of Tenth Grave', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (10, 'Discovered in the attic in which she spent the last years of her life, Anne Frank`s remarkable diary has since become a world classic a powerful reminder of the horrors of war and an eloquent testament to the human spirit.', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 8, 'The Diary of a Young Girl', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (11, 'With 0.3MP camera can Video/Photograph,3 flight speed mode,Low voltage alarm,With LED light for night flight', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 189, 'Cheerson CX-10C', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (12, 'Headless/IOC function. Usually, the forward direction of a flying multi-rotor is the same as the nose direction. By using Headless/IOC, the forward direction has nothing to do with nose direction. This lessens the steepness of the learning curve and allows the pilot to enjoy flight while slowly learning each specific orientation of the quadcopter.Equipped with the latest 6-axis flight control systems, 3D lock, More scheduled flight, operating more to the force!Equipped with HD camera to take photos and videos while flying! Bring a new perspective to your photos and videos from the air.', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 289, 'Cheerwing Syma X5SW-V3', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (13, 'WRIST HEART RATE MONITOR: Accurate wrist-based heart rate monitor with personalized training guidance to reach your fitness goals', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 289, 'Polar A360 Fitness Tracker with Wrist Heart Rate Monitor', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values (14, 'ACTIVITY TRACKER: Waterproof fitness monitor motivates you to reach your daily goal by tracking your steps, distance, and calories burned 24/7', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 319, 'Polar A300 Fitness Tracker and Activity Monitor', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));

insert into items (id, description, start_date, initial_price, name, end_date) values(15, 'ASOS Super Skinny Blazer in Camel and Black Check', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 400, 'ASOS Super Skinny', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(16, 'Noak Skinny Blazer in Texture', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 500, 'Noak Skinny Blazer', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(17, 'Another Skinny Blazer in Texture', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 300, 'Another Skinny Blazer', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(18, 'Rains Waterproof Parka Coat In Green', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 500, 'Parka ', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(19, 'River Island Skinny Jeans In Light Wash Blue With Abrasions', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 200, 'Skinny Jeans ', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));

insert into items (id, description, start_date, initial_price, name, end_date) values(20, 'ASOS Super Skinny Blazer in Camel and Black Check', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 400, 'ASOS Super Skinny', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(21, 'Noak Skinny Blazer in Texture', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 500, 'Noak Skinny Blazer', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(22, 'Another Skinny Blazer in Texture', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 400, 'Another Skinny Blazer', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(23, 'Rains Waterproof Parka Coat In Green', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 500, 'Parka ', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));
insert into items (id, description, start_date, initial_price, name, end_date) values(24, 'River Island Skinny Jeans In Light Wash Blue With Abrasions', PARSEDATETIME('12-06-2017', 'dd-MM-yyyy'), 200, 'Skinny Jeans ', PARSEDATETIME('10-05-2016', 'dd-MM-yyyy'));


insert into items_categories (category_id, item_id) values(3, 1);
insert into items_categories (category_id, item_id) values(5, 2);
insert into items_categories (category_id, item_id) values(3, 3);
insert into items_categories (category_id, item_id) values(16, 4);
insert into items_categories (category_id, item_id) values(16, 5);
insert into items_categories (category_id, item_id) values(11, 6);
insert into items_categories (category_id, item_id) values(11, 7);
insert into items_categories (category_id, item_id) values(3, 8);
insert into items_categories (category_id, item_id) values(5, 9);
insert into items_categories (category_id, item_id) values(3, 10);
insert into items_categories (category_id, item_id) values(16, 11);
insert into items_categories (category_id, item_id) values(16, 12);
insert into items_categories (category_id, item_id) values(11, 13);
insert into items_categories (category_id, item_id) values(11, 14);
insert into items_categories (category_id, item_id) values(13, 15);
insert into items_categories (category_id, item_id) values(13, 16);
insert into items_categories (category_id, item_id) values(13, 17);
insert into items_categories (category_id, item_id) values(13, 18);
insert into items_categories (category_id, item_id) values(13, 19);
insert into items_categories (category_id, item_id) values(14, 20);
insert into items_categories (category_id, item_id) values(14, 21);
insert into items_categories (category_id, item_id) values(14, 22);
insert into items_categories (category_id, item_id) values(14, 23);
insert into items_categories (category_id, item_id) values(14, 24);

insert into bids (amount, item_id, user_id, creation_date) values(100, 1, 1, now());
insert into bids (amount, item_id, user_id, creation_date) values(200, 2, 1, now());
insert into bids (amount, item_id, user_id, creation_date) values(300, 1, 2, now());
insert into bids (amount, item_id, user_id, creation_date) values(400, 2, 2, now());





