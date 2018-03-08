package main.java.excilys.cdb.service;

import java.util.ArrayList;
import java.util.Optional;

import main.java.excilys.cdb.dao.InterfaceDao;
import main.java.excilys.cdb.dao.DaoComputer;
import main.java.excilys.cdb.model.Computer;
import main.java.excilys.cdb.model.Page;

public enum ServiceComputer {
	INSTANCE;
	
	private InterfaceDao<Computer> daocomputer= DaoComputer.INSTANCE;

	ServiceComputer(){
	}

	public ArrayList<Computer> daoGetAllEntities() {
		return daocomputer.getAll();
	}

	public Page<Computer> daoGetPage(Page<Computer> page){
		page.elementsPage=daocomputer.getPage(page.getOffset(),page.getLimit());
		return page;
	}
	
	public int daoGetNbComputer() {
		return daocomputer.getNbElement();
	}

	public boolean daoCreate(Computer computer) {
		return daocomputer.create(computer);
	}

	public void daoUpdate(Computer computer) {
		daocomputer.update(computer);
	}

	public void daoDelete(Computer computer) {
		daocomputer.delete(computer);
	}
	
	public Optional<Computer> daoFindById(int id){
		return daocomputer.findById(id);
	}
}


