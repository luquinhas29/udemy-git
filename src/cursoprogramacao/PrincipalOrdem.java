package cursoprogramacao;

import java.util.Date;

import entities.Ordem;
import entities.enums.OrdemStatus;

public class PrincipalOrdem {

	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(1080, new Date(), OrdemStatus.AGUARDANDO_PAGAMENTO);
		System.out.println(ordem);

		OrdemStatus os1 = OrdemStatus.AGUARDANDO_PAGAMENTO;
		OrdemStatus os2 = OrdemStatus.valueOf("AGUARDANDO_PAGAMENTO");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
