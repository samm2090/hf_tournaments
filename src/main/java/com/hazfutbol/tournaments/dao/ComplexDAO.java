package com.hazfutbol.tournaments.dao;

import java.util.List;

import com.hazfutbol.tournaments.bean.Complex;

public interface ComplexDAO {

	List<Complex> listComplexes();
	
	List<String> listComplexesNames();
}
