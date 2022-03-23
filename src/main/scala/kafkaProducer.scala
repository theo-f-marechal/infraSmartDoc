import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}
import java.util.Properties

object kafkaProducer{

  /**
   * Connect to the Kafka stream and send a message
   * @param key the key of the message
   * @param message the message to be sent
   */
  def sendReport(key : Int, message : String): Unit = {
    val topic: String = "images"
    val brokers: String = "localhost:9092"
    val props = new Properties()
    props.put("bootstrap.servers", brokers)
    props.put("client.id", "producer")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    val producer = new KafkaProducer[String, String](props)
    val data = new ProducerRecord[String, String](topic, key.toString, message)
    producer.send(data)
    producer.close()
  }
}