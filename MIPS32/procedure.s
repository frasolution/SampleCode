
# procedure sample

.data
	text1: .asciiz "hello"
	text2: .asciiz " world!\n"
	
.text
	main:
		la $a0, text1   # load adress for text1
		jal procedure   # jump to procedure
		
		la $a0, text2   # load adress for text2
		jal procedure   # jump to procedure

        j end           # jump to the end of the program
	
	end:
		addiu $v0, $zero, 0x0000000a    # exit program 10
		syscall                         # syscall
	
    # must be here since everything under a procedure will executed if before main`
	procedure:                          
		addiu $v0, $zero, 0x00000004    # prep for print string
		syscall                         # syscall
		jr $ra                          # jump back to
	