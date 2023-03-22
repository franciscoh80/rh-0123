package nosi.webapps.gestao_de_recursos_humanos.helpers.meu_mapa;

import org.hibernate.Session;
import org.hibernate.Transaction;

import nosi.core.webapp.Core;
import nosi.webapps.gestao_de_recursos_humanos.dao.TVacationMap;
import nosi.webapps.gestao_de_recursos_humanos.pages.meu_mapa.Meu_mapa;
import nosi.webapps.gestao_de_recursos_humanos.pages.meu_mapa.Meu_mapaController;
import nosi.webapps.gestao_de_recursos_humanos.pages.meu_mapa.Meu_mapaView;

/**
 * USER 21/03/2023
 */
public class HelperMeuMapa {

	public static void gravar(Meu_mapa model, Meu_mapaController meu_mapaController) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		String isEdit = Core.getParam("isEdit");
		try{
		if (model.validate()) {
			session = Core.getSession(Core.defaultConnection());
			transaction = session.getTransaction();
			if(!transaction.isActive())
				transaction.begin();
			TVacationMap tvacationmap  = new TVacationMap();
			if(Core.isNotNull(isEdit)) {
				 tvacationmap = session.find(TVacationMap.class, Core.toInt(model.getMap_id()));
			}
			if (tvacationmap != null){
				tvacationmap.setStartDate1(Core.convertStringToLocalDate(model.getData_inicio_1(), Core.DD_MM_YYYY));
				tvacationmap.setDays1(model.getDias_1());
				tvacationmap.setStartDate2(Core.convertStringToLocalDate(model.getData_inicio_2(), Core.DD_MM_YYYY));
				tvacationmap.setDays2(model.getDias_2());
				tvacationmap.setStartDate3(Core.convertStringToLocalDate(model.getData_inicio_3(), Core.DD_MM_YYYY));
				tvacationmap.setDays3(model.getDias_3());
				tvacationmap.setStartDate4(Core.convertStringToLocalDate(model.getData_inicio_4(), Core.DD_MM_YYYY));
				tvacationmap.setDays4(model.getDias_4());
			}
			session.persist(tvacationmap);
			transaction.commit();
			Core.setMessageSuccess();
		}
		else
			Core.setMessageError();
		}catch ( Exception e ) {
			e.printStackTrace();
			Core.setMessageError("Error: "+ e.getMessage());
			if (transaction != null)
				transaction.rollback();
		}finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		
		if(Core.isNotNull(isEdit)) {
			meu_mapaController.addQueryString("isEdit", "true");
		}
	}

	public static void index(Meu_mapa model, Meu_mapaView view, Meu_mapaController meu_mapaController) {
		// TODO Auto-generated method stub
		try {
			String isEdit = Core.getParam("isEdit");
			if (Core.isNotNull(isEdit)) {
				TVacationMap tvacationmap = new TVacationMap().findOne(Core.getParamInt("p_map_id"));
				if (tvacationmap != null && !tvacationmap.hasError()) {
					model.setFuncionario(tvacationmap.getEmployeeId().getFirstName().concat(" ")
							.concat(tvacationmap.getEmployeeId().getLastName()));
					model.setDias_ano_ante(tvacationmap.getTransportedDays());
					model.setDias_ano_atual(22);
					model.setTotal_de_dias(tvacationmap.getTransportedDays() + 22);
					model.setMap_id(tvacationmap.getVacationMapId().toString());
					model.setData_inicio_1(
							Core.convertLocalDateToString(tvacationmap.getStartDate1(), Core.DD_MM_YYYY));
					model.setDias_1(tvacationmap.getDays1());
					model.setData_inicio_2(
							Core.convertLocalDateToString(tvacationmap.getStartDate2(), Core.DD_MM_YYYY));
					model.setDias_2(tvacationmap.getDays2());
					model.setData_inicio_3(
							Core.convertLocalDateToString(tvacationmap.getStartDate3(), Core.DD_MM_YYYY));
					model.setDias_3(tvacationmap.getDays3());
					model.setData_inicio_4(
							Core.convertLocalDateToString(tvacationmap.getStartDate4(), Core.DD_MM_YYYY));
					model.setDias_4(tvacationmap.getDays4());

					view.btn_gravar.addParameter("isEdit", "true");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
