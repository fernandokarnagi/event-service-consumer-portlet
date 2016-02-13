package sg.com.ctcdemo.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.docs.eventlisting.model.Event;
import com.liferay.docs.eventlisting.service.EventServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class EventConsumer
 */
public class EventConsumer extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		try {
			List<Event> events = EventServiceUtil.findAll();
			System.out.println("events: " + events);
			for (Event event : events) {
				System.out.println(event);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}

}
