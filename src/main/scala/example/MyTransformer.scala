package example

import org.apache.spark.ml.Transformer
import org.apache.spark.ml.util.Identifiable
import org.apache.spark.ml.param.ParamMap
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql._
import org.apache.spark.sql.types.StructField
import org.apache.spark.sql.types.IntegerType

class Signatures (override val uid: String) extends Transformer {

  def this() = this(Identifiable.randomUID("Signatures"))

  def copy(extra: ParamMap): Signatures = {
    defaultCopy(extra)
  }

  override def transformSchema(schema: StructType): StructType = {
    // Add the return field
    schema.add(StructField("myValue", IntegerType, false))
  }

  def transform(df: Dataset[_]): DataFrame = {
    df.rdd.map(x=>x.mkString(","))

    val doer = new example.MyJavaAPI()
    df
  }
}