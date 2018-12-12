package cl.programando.oracleeloquarest.controller;



import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.programando.oracleeloquarest.entity.ActionServiceEntity;


@Controller
@RequestMapping(value="/rest/sms",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OracleEloquaSMSController{

	
	private static final Logger logger = Logger.getLogger(OracleEloquaSMSController.class);
	    
	@RequestMapping(value = "/create")
	public @ResponseBody ResponseEntity<ActionServiceEntity> create(ActionServiceEntity actionService){
	 	// TODO Auto-generated method stub
		logger.info("create actionservice "+actionService);
	
		return new ResponseEntity<ActionServiceEntity>(actionService, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/configure", method = RequestMethod.POST)
	public String configure(Model model, @RequestParam("action")String action, @RequestParam("siteName")String siteName, @RequestParam("assetId")String assetId, @RequestParam("assetName")String assetName,@RequestParam("searchName")String searchName,@RequestParam("messageText")String messageText,@RequestParam("userSecurity")String userSecurity, @RequestParam("passSecurity")String passSecurity, @RequestParam("typeData")String typeData){
		
	/*	try {
				logger.info("TypeData database");
				ProcessTypeEntity processType = new ProcessTypeEntity();
				processType.setSearchType(EloquaType.CAMPAIGN);
				processType.setSearchName(assetName);
				processType.setSearchId(Integer.parseInt(assetId));

				logger.info("ProcessType entity : "+processType);
				OracleEloquaSMSActiveService service = new OracleEloquaSMSActiveService(processType);
				service.load();
				
				OracleEloquaSMSEntity oracleEloqua = service.getOracleEloqua();
				oracleEloqua.getProcessType().setSearchName(searchName);
				oracleEloqua.setInfoBipSmsFormat(messageText);
				oracleEloqua.getAuthentication().setCompany(siteName);
				service.updateConfig(oracleEloqua);
				
				logger.info("service object:"+service.getOracleEloqua());
				model.addAttribute("searchName", service.getOracleEloqua().getProcessType().getSearchName());
				model.addAttribute("messageText", service.getOracleEloqua().getInfoBipSmsFormat());
				model.addAttribute("message", "Se ha actualizado la campana.");
			    return "configuration";		
			
		} catch (Exception e) {
			logger.info("configuration actionservice finish ERROR:"+e.getMessage());
			return "no_autorizado";		
		}*/
		return "no_autorizado";	
	}
	
	@RequestMapping(value = "/configure", method = RequestMethod.GET)
	public String configure(Model model, @RequestParam("siteName")String siteName, @RequestParam("assetId")String assetId, @RequestParam("assetName")String assetName,@RequestParam("userSecurity")String userSecurity, @RequestParam("passSecurity")String passSecurity, @RequestParam("typeData")String typeData){
		
		/*try {
			if (typeData!=null && typeData.equalsIgnoreCase(Parameters.TYPE_DATA_PROPERTIES)){
				AuthProperties security;
			
				security = new AuthProperties(Parameters.PATH_BASE_CONTROLLER+"/"+siteName);
			
				if (security.authenticate(userSecurity, passSecurity)) {
					
					String path = Parameters.PATH_BASE_CONTROLLER+"/"+siteName+"/"+assetName+".properties";
	
					OracleEloquaSMSActiveService service = new OracleEloquaSMSActiveService(path);				
					service.load();
					logger.info("service object:"+service.getOracleEloqua());
					model.addAttribute("searchName", service.getOracleEloqua().getProcessType().getSearchName());
					model.addAttribute("messageText", service.getOracleEloqua().getInfoBipSmsFormat());
					model.addAttribute("message", "");
				    return "configuration";
					
				}else {
					logger.warn("No autorizado:"+siteName);
					return "no_autorizado";
				}
			}else if (typeData==null || typeData.equalsIgnoreCase(Parameters.TYPE_DATA_DATABASE)){
				logger.info("TypeData database");
				ProcessTypeEntity processType = new ProcessTypeEntity();
				processType.setSearchName(assetName);
				processType.setSearchType(EloquaType.CAMPAIGN);
				processType.setSearchId(Integer.parseInt(assetId));

				logger.info("ProcessType entity : "+processType);
				OracleEloquaSMSActiveService service = new OracleEloquaSMSActiveService(processType);
				service.load();
				
				if (service.getOracleEloqua()==null) {
					logger.info("service object:"+service.getOracleEloqua());
					
					model.addAttribute("searchName", "");
					model.addAttribute("messageText", "");
					model.addAttribute("action", "new");
					model.addAttribute("message", "Favor aplicar configuracion respectiva.");
				}else {
					model.addAttribute("searchName", service.getOracleEloqua().getProcessType().getSearchName());
					model.addAttribute("messageText", service.getOracleEloqua().getInfoBipSmsFormat());
					model.addAttribute("action", "update");
					model.addAttribute("message", "");
				}
				return "configuration";		
			}
		
		} catch (IOException e) {
			logger.info("configuration actionservice finish ERROR:"+e.getMessage());
			return "no_autorizado";		
		} catch (Exception e) {
			logger.info("configuration actionservice finish ERROR:"+e.getMessage());
			return "no_autorizado";		
		}*/
		return "no_autorizado";
	}
	
	
	
	@RequestMapping(value = "/notification")
	public @ResponseBody ResponseEntity<ActionServiceEntity> notification(ActionServiceEntity actionService, @RequestBody String body){
	 	// TODO Auto-generated method stub
		
		/*logger.info("Inicializando log .....");
		logger.info("notification actionservice Object "+actionService);
		logger.info("Body request :"+body);
		if (actionService.getTypeData()!=null && actionService.getTypeData().equalsIgnoreCase(Parameters.TYPE_DATA_PROPERTIES)) {
			try {
				AuthProperties  security = new AuthProperties(Parameters.PATH_BASE_CONTROLLER+"/"+actionService.getSiteName());
						
				if (security.authenticate(actionService.getUserSecurity(), actionService.getPassSecurity())) {

					String path = Parameters.PATH_BASE_CONTROLLER+"/"+actionService.getSiteName()+"/"+actionService.getAssetName()+".properties";
					logger.info("TypeData properties "+path);

					OracleEloquaSMSActiveThread service = new OracleEloquaSMSActiveThread(path);
					service.start();
					logger.info("notification actionservice finish OK");
				
					return new ResponseEntity<ActionServiceEntity>(HttpStatus.OK);
				}else {
					logger.warn("No autorizado:"+actionService);
					return new ResponseEntity<ActionServiceEntity>(HttpStatus.UNAUTHORIZED);
				}
			
			} catch (IOException e) {
				logger.info("notification actionservice finish ERROR:"+e.getMessage());
			}
	
		}else if (actionService.getTypeData()==null || actionService.getTypeData().equalsIgnoreCase(Parameters.TYPE_DATA_DATABASE)){
			logger.info("TypeData database");
			ProcessTypeEntity processType = new ProcessTypeEntity();
			processType.setSearchName(actionService.getAssetName());
			processType.setSearchType(EloquaType.fromString(actionService.getAssetType()));
			processType.setSearchId(Integer.parseInt(actionService.getAssetId()));
			logger.info("ProcessType entity : "+processType);
			OracleEloquaSMSActiveThread service = new OracleEloquaSMSActiveThread(processType);
			logger.info("Antes de start....");
			service.start();
			
			return new ResponseEntity<ActionServiceEntity>(HttpStatus.NO_CONTENT);
			
		}*/
		 
		return new ResponseEntity<ActionServiceEntity>(HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	
}