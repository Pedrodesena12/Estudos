package Equipamentos;

import java.util.ArrayList;
import java.util.List;

public class ControleEquipamentos {

	List<Equipamentos> equipamentos = new ArrayList<>();

	public boolean adicionarEquipamentos(Equipamentos e) {
		for (int i = 0; i < equipamentos.size(); i++) {

			if (equipamentos.get(i).getCodigoID() == e.getCodigoID()) {
				return false;
			}
		}
		equipamentos.add(e);
		return true;
	}

	public boolean retirarEquipamentosPorId(int ID) {
		for(int q = 0; q < equipamentos.size(); q++) {
			
			if(equipamentos.get(q).getCodigoID() == ID) {
				 equipamentos.remove(q);
				 return true;
			}
			
		}
	
		return false;
		
	}
	
}
