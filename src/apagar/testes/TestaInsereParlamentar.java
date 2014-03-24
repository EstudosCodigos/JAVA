package apagar.testes;

import java.util.Iterator;
import java.util.List;

import com.devMedia.sample.MongoConnection;
import com.devMedia.sample.User;
import com.devMedia.sample.UserDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.omm.controller.DespesasController;
import com.omm.model.Despesas;

public class TestaInsereParlamentar {

	public static void main(String[] args)
	{
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MySql_to_MongoDB");
//		EntityManager em = factory.createEntityManager();
//		
//		Teste_apagar p =new Teste_apagar();
//		p.setColun_1("hahaha");
//		p.setId(001);
//		
//		em.getTransaction().begin();
//		em.persist(p);
//		em.getTransaction().commit();
	
		
		DespesasController despesasController = DespesasController.getInstance();
		try 
		{
			//conexao MongoDB 
			MongoConnection connection = MongoConnection.getInstance();
			DB db=connection.getDB();
			DBCollection coll = db.getCollection("despesas");
			
			
			
			List<Despesas> listDespesas= despesasController.getAllDespesas();
			
			System.out.println(listDespesas.size());
			
		    getDoc(listDespesas, coll);
		    
			System.out.println("Done!");
		}catch(Exception error)
		{
			error.printStackTrace();
		}
		//findByAge();
	}
	private static void findByAge()
	{
		UserDao dao=new UserDao();
		BasicDBObject query = new BasicDBObject();
		
		query.put("age",70);
		
		List<User>users=dao.findUsers(query);
		
		System.out.println("Result:::");
		for(User user:users)
		{
			System.out.println(user.toString());
		}
	}
	private static void getDoc(List<Despesas> listDespesas,DBCollection coll)
	{
		BasicDBObject doc = new BasicDBObject();
		
		Iterator iterator= listDespesas.iterator();
		Despesas despesa;
		while(iterator.hasNext())
		{
			
			despesa=(Despesas)iterator.next();
			if(despesa.getNuCarteiraParlamentar()>0)
				doc.append("nuCarteiraParlamentar", despesa.getNuCarteiraParlamentar());
			
			if(despesa.getNuLegislatura()>0)
				doc.append("nuLegislatura", despesa.getNuLegislatura());
			
			if(!despesa.getSgUF().equals(null))
				doc.append("sgUF", despesa.getSgUF());
			
			if(!despesa.getSgPartido().equals(null))
				doc.append("sgPartido", despesa.getSgPartido());
			
			if(despesa.getCodLegislatura()>0)
				doc.append("codLegislatura", despesa.getCodLegislatura());
			
			if(despesa.getNumSubCota()>0)
				doc.append("numSubCota", despesa.getNumSubCota());
			
			if(despesa.getNumEspecificacaoSubCota()>0)
				doc.append("numEspecificacaoSubCota", despesa.getNumEspecificacaoSubCota());
			
			if(despesa.getVlrLiquido()>0)
				doc.append("vlrLiquido", despesa.getVlrLiquido());
			
			if(despesa.getNumMes()>0)
				doc.append("numMes", despesa.getNumMes());
			
			if(despesa.getNumAno()>0)
				doc.append("numAno", despesa.getNumAno());
			
			coll.insert(doc);
			
			doc.clear();
		}
		
		 
	}
	
}
