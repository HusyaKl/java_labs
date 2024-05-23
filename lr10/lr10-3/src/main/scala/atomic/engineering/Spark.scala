package atomic.engineering

import org.apache.spark.sql.SparkSession

//https://www.kaggle.com/datasets/emirhanai/social-media-usage-and-emotional-well-being

object Spark {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[1]").appName("AtomicEngineering").getOrCreate()

    println("name:" + spark.sparkContext.appName)
    val path = "src/train.csv"
    val df = spark.read.option("header", "true").csv(path)
//    df.show()


    df.createOrReplaceTempView("data")

    spark.sql("SELECT * FROM data limit 10").show
    spark.sql("SELECT AVG(Messages_Sent_Per_Day) FROM data WHERE Platform = 'Twitter'").show
    spark.sql("SELECT * FROM data WHERE Gender = 'Female' AND Age > 18 AND Age<24").show
    spark.sql("SELECT Dominant_Emotion FROM data WHERE Gender = 'Male' AND Posts_Per_Day>5").show
    spark.sql("SELECT AVG(Likes_Received_Per_Day) FROM data WHERE Platform = 'Instagram' AND Gender = 'Female'").show
    spark.sql("SELECT AVG(Likes_Received_Per_Day) FROM data WHERE Platform = 'Instagram' AND Posts_Per_Day>1").show
    spark.sql("SELECT Dominant_Emotion FROM data WHERE Age>30 AND Posts_Per_Day>1").show
    spark.sql("SELECT Age FROM data WHERE Platform = 'Facebook' AND Dominant_Emotion = 'Boredom'").show
    spark.sql("SELECT * FROM data WHERE Platform = 'Facebook' AND Gender = 'Female' AND Age < 25").show
    spark.sql("SELECT Age FROM data WHERE Platform = 'Instagram' AND Likes_Received_Per_Day > 100").show



    spark.stop()
  }
}


