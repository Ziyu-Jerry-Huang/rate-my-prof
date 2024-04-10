-- (1) USER INFORMATION TABLE

DROP TABLE IF EXISTS user;
CREATE TABLE user (
    user_id           INT             NOT NULL AUTO_INCREMENT    COMMENT 'unique user id',
    username          VARCHAR(30)     NOT NULL                   COMMENT 'user name',
    password          VARCHAR(100)    DEFAULT ''                 COMMENT 'user password',
    email             VARCHAR(50)     DEFAULT ''                 COMMENT 'user email',
    phone_number      VARCHAR(20)     DEFAULT ''                 COMMENT 'user phone number',
    profile_img       VARCHAR(100)    DEFAULT ''                 COMMENT 'url to the profile img',
    login_ip          VARCHAR(128)    DEFAULT ''                 COMMENT 'last login ip',
    login_date        DATETIME                                   COMMENT 'last login time',
    create_time       DATETIME                                   COMMENT 'user sign in time',
    PRIMARY KEY (user_id)
) AUTO_INCREMENT=100 COMMENT = 'user information table';

-- (2) AGENTS TABLE

DROP TABLE IF EXISTS agents;
CREATE TABLE agents (
    agent_id           INT               NOT NULL AUTO_INCREMENT     COMMENT 'unique agent id',
    agent_name         VARCHAR(32)       NOT NULL                    COMMENT 'name of this agent',
    url                VARCHAR(255)      NOT NULL                    COMMENT 'url to the agent',
    category_id        INT               NOT NULL                    COMMENT 'agent category',
    description        VARCHAR(255)      DEFAULT ''                  COMMENT 'description of the agent',
    score              DECIMAL(10, 2)    DEFAULT 0                   COMMENT 'agent public rating',
    visited_num        INT               DEFAULT 0                   COMMENT 'agent click num',
    is_active          VARCHAR(1)        DEFAULT '1'                 COMMENT '1 - active, 0 - inactive',
    fee                VARCHAR(1)        DEFAULT '2'                 COMMENT '0 - free, 1 - paid, 2 - unknown',
    PRIMARY KEY (agent_id)
) AUTO_INCREMENT=1 COMMENT = 'agent information table';

-- (3) CATEGORY TABLE

DROP TABLE IF EXISTS categories;
CREATE TABLE categories (
    category_id           INT            NOT NULL AUTO_INCREMENT    COMMENT 'unique category id',
    category              VARCHAR(64)    NOT NULL                   COMMENT 'category name',
    PRIMARY KEY (category_id)
) AUTO_INCREMENT=10 COMMENT = 'category table';

-- Initialize categories table
INSERT INTO categories (category)
VALUES
    ('Closed-source LLMs'),
    ('Open Source LLMs'),
    ('Writing'),
    ('Image Creation'),
    ('Speech Recognition');

-- (4) USER COMMENTS TABLE

DROP TABLE IF EXISTS comments;
CREATE TABLE comments (
    comment_id           INT             NOT NULL AUTO_INCREMENT    COMMENT 'unique comment id',
    user_id              INT             NOT NULL                   COMMENT 'comment author user id',
    agent_id             INT             NOT NULL                   COMMENT 'agent id this comment belongs to',
    comment              VARCHAR(2048)   DEFAULT ''                 COMMENT 'comment content',
    likes                INT             DEFAULT 0                  COMMENT 'number of being liked',
    PRIMARY KEY (comment_id)
) AUTO_INCREMENT=100 COMMENT = 'user comments table';