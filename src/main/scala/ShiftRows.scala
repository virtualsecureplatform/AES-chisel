import chisel3._
import chisel3.util._

class ShiftRows extends Module{
	val io = IO(
		val in   = Input(Vec(4,Vec(4,UInt(8.W))))
		val out  = Input(Vec(4,Vec(4,UInt(8.W))))
	)

	for(i <- 0 until 4){
		for(j <- 0 until 4){
			io.out(i)(j) := io.in(i)((j+i)%4)
		}
	}
}

class InvShiftRows extends Module{
	val io = IO(
		val in   = Input(Vec(4,Vec(4,UInt(8.W))))
		val out  = Input(Vec(4,Vec(4,UInt(8.W))))
	)

	for(i <- 0 until 4){
		for(j <- 0 until 4){
			io.out(i)(j) := io.in(i)((j-i)%4)
		}
	}
}