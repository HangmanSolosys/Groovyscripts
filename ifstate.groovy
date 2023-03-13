def x = 0 

def result = ""

switch(x) {

	case 0:
		result = "x is zero"
		break

	case {x>0}:
		result = "x is +ve"
		break

	case {x<0}:
		result = "x is -ve"
		break

	default:
		result = "Invalid number"

}

println result 


































