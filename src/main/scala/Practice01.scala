object Practice01 {
  def main(args:Array[String]):Unit = {
    //1.Int型のvar変数xを宣言し、初期値として10を代入してください
    var x = 10
    //2.変数xの値を2倍して、変数xに再格納してください
    x*=2
    //3.Int型のval変数yを宣言し、初期値として変数xの値を7で割った余りを代入してください
    val y =  x%7
    //4.変数yの値を文字列の説明付きで出力してください
    print("10から2倍した数を7で割ったあまりの数:" +y)
  }
}
