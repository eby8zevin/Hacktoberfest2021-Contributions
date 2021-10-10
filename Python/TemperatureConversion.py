from __future__ import print_function
import math

def main():
	print ("Konversi suhu \n")
	print ("Author: FR11ZZ\n")
	print ("hargailah Karya seseorang\n")
	print ("Dengan cara tidak mengganti nama Author\n") 

	C = float(raw_input("Masukkan Nilai (Celcius): "))

	K = C + 273
	F = 5 * (C + 32) / 9 
	R = 4 * C / 5

	print ("Celcius \t:", C)
	print ("Kelvin  \t:", K)
	print ("Fahrenheit \t:", F)
	print ("Reamur     \t:", R)

if __name__ == '__main__':
	main()