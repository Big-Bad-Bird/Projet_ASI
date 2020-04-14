package services;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import controler.CardDao;
import model.CardModel;
import utils.Tools;

@Path("/servicescard")
public class UserServices {
	private CardDao dao;
	
	@Context
	ServletContext context;
	
	public UserServices() {
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cards")
	public String getCards() {
		getDao();
		String cardsJson=this.dao.getCardsJson();	
		return cardsJson;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/card/{cardId}")
	public String getCardById(
			@PathParam("cardId") String cardId) {
		getDao();
		return Tools.toJsonString(this.dao.getCard(cardId));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/find")
	public String findCard(@QueryParam("name") String cardName) {
		getDao();
		String jsonCard=Tools.toJsonString(this.dao.getCardByName(cardName));
		return jsonCard;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add")
	public String findCard(CardModel newCard) {
		getDao();
		this.dao.addCard(newCard);
		return "{'request:'success'}";
	}
	
	
	public CardDao getDao(){
		if(context.getAttribute("DAO")!=null){
			this.dao=(CardDao)context.getAttribute("DAO");
		}else{
			this.dao=new CardDao();
			context.setAttribute("DAO",this.dao);
		}
		return this.dao;
	}

}
