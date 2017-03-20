package lt.itakademija.controller;

import lt.itakademija.model.Id;
import lt.itakademija.model.command.CreateContact;
import lt.itakademija.model.command.CreateMessage;
import lt.itakademija.model.command.UpdateContact;
import lt.itakademija.model.query.Contact;
import lt.itakademija.model.query.Message;
import lt.itakademija.repository.MessengerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mariusg on 2017.03.19.
 */
@RestController
@RequestMapping(value="webapi/messenger")
public class MessengerServiceController {
	@Autowired
    private final MessengerRepository repository;

    public MessengerServiceController(MessengerRepository repository) {
        this.repository = repository;
    }
    @RequestMapping(method=RequestMethod.POST,path="/webapi/messenger/contacts")
    @ResponseStatus(value=HttpStatus.CREATED)
    public Id createContact(CreateContact createContact) {
         repository.createContact(createContact);
         return null;
    }
    @RequestMapping(method=RequestMethod.GET, path="/webapi/messenger/contacts")
    public List<Contact> getContacts() {
        return repository.getContacts();
    }
    @RequestMapping(method=RequestMethod.GET, path="/webapi/messenger/contacts")
    public Contact getContact(Long contactId) {
        return repository.getContact(contactId);
    }
    @RequestMapping(method=RequestMethod.PUT, path="/webapi/messenger/contacts/{contactId}")
    @ResponseStatus(value=HttpStatus.OK)
    public void updateContact(Long contactId,
                              UpdateContact updateContact) {
        repository.updateContact(contactId, updateContact);
    }
    @RequestMapping(method=RequestMethod.DELETE, path="/webapi/messenger/contacts/{contactId}")
    @ResponseStatus(value=HttpStatus.OK)
    public void deleteContact(Long contactId) {
        repository.deleteContact(contactId);
    }
    @RequestMapping(method=RequestMethod.POST)
    @ResponseStatus(value=HttpStatus.CREATED)
    public Id createMessage(Long contactId,
                            CreateMessage createMessage) {
        repository.createMessage(contactId, createMessage);
        return null;
    }
    @RequestMapping(method=RequestMethod.GET, path="/webapi/messenger/messages/{contactId}")
    @ResponseStatus(value=HttpStatus.OK)
    public List<Message> getMessages(Long contactId) {
        return repository.getMessages(contactId);
    }

}
