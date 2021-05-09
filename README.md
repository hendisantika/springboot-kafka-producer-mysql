# springboot-kafka-producer-mysql

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/springboot-kafka-producer-mysql.git`
2. Navigate to the folder: `cd springboot-kafka-producer-mysql`
3. Run ZooKeeper & Kafka: `zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties`
   & `kafka-server-start /usr/local/etc/kafka/server.properties`
4. Open the 3rd terminal to create a Kafka
   topic: `kafka-topics --bootstrap-server localhost:9092 --topic <enter-a-topic> --create --partitions 1 --replication-factor 1`
5. Run the application: `mvn clean spring-boot:run`

Source Article: https://levelup.gitconnected.com/easy-java-springboot-apache-kafka-setup-on-macos-ceb481e167f8