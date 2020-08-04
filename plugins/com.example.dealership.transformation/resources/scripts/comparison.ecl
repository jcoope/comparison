rule catalogue match l:X!t_Catalogue with r:M!Library {
	compare{
		return l.a_name = r.manufacturer;
	} 
}
