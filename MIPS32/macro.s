
# macro sample

.data
	text1: .asciiz "hello"
	text2: .asciiz " world!\n"
    
.text

	.macro print_string
		li $v0, 4 	# prep for print string
		syscall		# syscall
	.end_macro
	
	main:
		la $a0, text1	# load adress for text1
		print_string	# use macro
		
		la $a0, text2	# load adress for text2
		print_string	# use macro
		
		j end

	end:
		#ending program
		li $v0, 10
		syscall
