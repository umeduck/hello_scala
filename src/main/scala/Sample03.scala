object Sample03 {
    def main(args:Array[String]):Unit={  
        println(123)
        println(0x7B)
        // println(0b00010110)コンパイルエラー
        // println(3000000000)コンパイルエラー
        println(3000000000L)
        val binary = Integer.parseInt("00010110", 2)
        println(binary)
    }
}
