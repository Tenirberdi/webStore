INSERT INTO role (id,name) VALUES (1,'ROLE_ADMIN');
INSERT INTO usr (id,full_name, login, pass,enabled, role_id) VALUES (1, 'first admin', 'admin', 'admin', 1, 1);
INSERT INTO `category`(`id`, `name`) VALUES (1,'none'),(2,'none');
INSERT INTO `product`(`id`, `manufacturer`, `description`, `name`, `price`, `quantity`, `category_id`, `photo`) VALUES (1,'none', 'none','none',100,100,1, '/images/products/img.png'),(2,'none', 'none','none',100,100,2, '/images/products/images.png');
