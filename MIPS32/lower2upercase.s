.data
	test: .asciiz "test\n"
.text
	main:
	la $a0, test 	# load target adress
	jal uc2lc	# jump to procedure
	la $a0, test	# load target adress
	li $v0, 4	# prepare for print ascii
	syscall		# syscall
	 
	j end # return 0 
	
	uc2lc:
		addi $sp, $sp, 4 		# increase stack pointer
		sw $ra, 0($sp)			# store return adress
		li $t1, 4			# load 4 to $t1 (max count loop)
		move $s0, $a0			# move lable adress from argument register
	uc2lcloop:
		bge $t0, $t1, uc2lcjumpack 	# if i ($t0) bigger than/equal to  $t1 jump to end
		lb $t3, 0($s0) 			# load byte from s0
		addi $t3, $t3, -32		# subtract 32 to recieve upper case letter
		sb $t3, 0($s0)			# store byte to s0 (save char back)
		addi $s0, $s0, 1 			# go to next byte
		addi $t0, $t0, 1 		# add one to loop count $t0
		j uc2lcloop
		
	uc2lcjumpack:
		lw $t0, 0($sp) 		# load return adress
		addi $sp, $sp, -4 	# adjust pointer down
		jr $t0 			# jump to return adress
	
	end: 
	li $v0, 10 	# prepare to end program
	syscall		# syscall