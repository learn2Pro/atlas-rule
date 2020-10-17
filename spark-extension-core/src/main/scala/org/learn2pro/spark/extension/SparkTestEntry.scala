package org.learn2pro.spark.`extension`

import org.apache.spark.sql.SparkSession

object SparkTestEntry {
  def main(args: Array[String]): Unit = {
    SparkSession.builder()
      .enableHiveSupport().getOrCreate()
  }

}
