import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class SparkTdwMetaTest extends AnyFunSuite with BeforeAndAfter {

  var spark: SparkSession = _
  var conf: SparkConf = _
  before {
    conf = new SparkConf(true)
      .setMaster("local[*]")
      .set("spark.sql.runSQLOnFiles", "true")
      .set("spark.sql.catalogImplementation", "in-memory")
      .set("spark.sql.extensions", "com.tencent.atlas.feature.catalyst.SparkTdwCatalogExtension")
    spark = SparkSession.builder().config(conf).getOrCreate()
  }

  test("123") {
    spark.sql(
      s"""
         |select * from pcg_weishi.person_table where dt=20101101
         |""".stripMargin).count()

  }
}
