from __future__ import print_function

def main():
	print ("Konversi Detik ke Jam\n")
	print ("Author: FR11ZZ\n")
	print ("hargailah Karya seseorang\n")
	print ("Dengan Cara Tidak mengganti Nama Author\n")

	totaldetik = int (raw_input("Masukkan detik \t: "))

	hh = totaldetik // 3600
	sisadetik = totaldetik % 3600
	mm = sisadetik // 60
	ss = sisadetik % 60

	print ("%d detik sama dengan %d:%d:%d" %
		(totaldetik, hh, mm, ss))

if __name__ == '__main__':
	main()