package com.packt.pfextensions.controller;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.extensions.component.timeline.TimelineUpdater;
import org.primefaces.extensions.event.timeline.TimelineAddEvent;
import org.primefaces.extensions.event.timeline.TimelineModificationEvent;
import org.primefaces.extensions.event.timeline.TimelineSelectEvent;
import org.primefaces.extensions.model.timeline.TimelineEvent;
import org.primefaces.extensions.model.timeline.TimelineModel;

import com.packt.pfextensions.model.Jobhub;

	@ManagedBean
	@ViewScoped
	public class JobhubTimelineController implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		private TimelineModel model;

		private boolean selectable = true;
		private boolean zoomable = true;
		private boolean moveable = true;
		private boolean stackEvents = true;
		private String eventStyle = "box";
		private boolean axisOnTop;
		private boolean showCurrentTime = true;
		private boolean showNavigation = false;
		
		  // private TimelineModel model;  
		    private TimelineEvent event; // current event to be changed, edited, deleted or added  
		    private long zoomMax;  
		    private Date start;  
		    private Date end;  
		    private TimeZone timeZone = TimeZone.getTimeZone("Europe/Madrid");  

		@PostConstruct
		protected void initialize() {
			
			// initial zooming is ca. one month to avoid hiding of event details (due to wide time range of events)  
	        zoomMax = 1000L * 60 * 60 * 24 * 30; 
	        
			model = new TimelineModel();

			Calendar cal = Calendar.getInstance();
			cal.set(2011, Calendar.MAY, 10, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("10000","500","2000000"), cal.getTime()));

			cal.set(2012, Calendar.JANUARY, 23, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("7000","700","540000"), cal.getTime()));

			cal.set(2012, Calendar.APRIL, 2, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("8000","590","2300000"), cal.getTime()));

			cal.set(2012, Calendar.APRIL, 16, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("1000","500","8800000"), cal.getTime()));

			cal.set(2012, Calendar.JUNE, 10, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("10300","500","2000000"), cal.getTime()));

			cal.set(2012, Calendar.JUNE, 19, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("60000","500","3300000"), cal.getTime()));

			cal.set(2012, Calendar.SEPTEMBER, 26, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("34000","700","6000000"), cal.getTime()));

			cal.set(2012, Calendar.OCTOBER, 13, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("15500","700","2000000"), cal.getTime()));

			cal.set(2012, Calendar.DECEMBER, 16, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("23000","600","2300000"), cal.getTime()));

			cal.set(2013, Calendar.FEBRUARY, 3, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("23000","500","233000"), cal.getTime()));

			cal.set(2013, Calendar.MAY, 4, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("55000","500","2330000"), cal.getTime()));

			cal.set(2013, Calendar.JUNE, 5, 0, 0, 0);
			model.add(new TimelineEvent(new Jobhub("222000","2300","23230000"), cal.getTime()));
		}

		public void onSelect(TimelineSelectEvent e) {
			TimelineEvent timelineEvent = e.getTimelineEvent();

			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected event:", timelineEvent.getData().toString());
			FacesContext.getCurrentInstance().addMessage(null, msg);
		}

		public TimelineModel getModel() {
			return model;
		}

		public boolean isSelectable() {
			return selectable;
		}

		public void setSelectable(boolean selectable) {
			this.selectable = selectable;
		}

		public boolean isZoomable() {
			return zoomable;
		}

		public void setZoomable(boolean zoomable) {
			this.zoomable = zoomable;
		}

		public boolean isMoveable() {
			return moveable;
		}

		public void setMoveable(boolean moveable) {
			this.moveable = moveable;
		}

		public boolean isStackEvents() {
			return stackEvents;
		}

		public void setStackEvents(boolean stackEvents) {
			this.stackEvents = stackEvents;
		}

		public String getEventStyle() {
			return eventStyle;
		}

		public void setEventStyle(String eventStyle) {
			this.eventStyle = eventStyle;
		}

		public boolean isAxisOnTop() {
			return axisOnTop;
		}

		public void setAxisOnTop(boolean axisOnTop) {
			this.axisOnTop = axisOnTop;
		}

		public boolean isShowCurrentTime() {
			return showCurrentTime;
		}

		public void setShowCurrentTime(boolean showCurrentTime) {
			this.showCurrentTime = showCurrentTime;
		}

		public boolean isShowNavigation() {
			return showNavigation;
		}

		public void setShowNavigation(boolean showNavigation) {
			this.showNavigation = showNavigation;
		}
		
		public void onChange(TimelineModificationEvent e) {  
	        // get clone of the TimelineEvent to be changed with new start / end dates  
	        event = e.getTimelineEvent();  
	  
	        // update booking in DB...  
	  
	        // if everything was ok, no UI update is required. Only the model should be updated  
	        model.update(event);  
	  
	        // otherwise (if DB operation failed) a rollback can be done with the same response as follows:  
	        // TimelineEvent oldEvent = model.getEvent(model.getIndex(event));  
	        // TimelineUpdater timelineUpdater = TimelineUpdater.getCurrentInstance(":mainForm:timeline");  
	        // model.update(oldEvent, timelineUpdater);  
	    }  
	  
	    public void onEdit(TimelineModificationEvent e) {  
	        // get clone of the TimelineEvent to be edited  
	        event = e.getTimelineEvent();  
	    }  
	  
	    public void onAdd(TimelineAddEvent e) {  
	        // get TimelineEvent to be added  
	        event = new TimelineEvent(new Jobhub(), e.getStartDate(), e.getEndDate(), true, e.getGroup());  
	  
	        // add the new event to the model in case if user will close or cancel the "Add dialog"  
	        // without to update details of the new event. Note: the event is already added in UI.  
	        model.add(event);  
	    }  
	  
	    public void onDelete(TimelineModificationEvent e) {  
	        // get clone of the TimelineEvent to be deleted  
	        event = e.getTimelineEvent();  
	    }  
	  
	    public void delete() {  
	        // delete booking in DB...  
	  
	        // if everything was ok, delete the TimelineEvent in the model and update UI with the same response.  
	        // otherwise no server-side delete is necessary (see timelineWdgt.cancelDelete() in the p:ajax onstart).  
	        // we assume, delete in DB was successful  
	        TimelineUpdater timelineUpdater = TimelineUpdater.getCurrentInstance(":adminForm:tabView:timeline");  
	        model.delete(event, timelineUpdater);  
	  
	    }  
	  
	    public void saveDetails() {  
	        // save the updated booking in DB...  
	  
	        // if everything was ok, update the TimelineEvent in the model and update UI with the same response.  
	        // otherwise no server-side update is necessary because UI is already up-to-date.  
	        // we assume, save in DB was successful  
	        TimelineUpdater timelineUpdater = TimelineUpdater.getCurrentInstance(":adminForm:tabView:timeline");  
	        model.update(event, timelineUpdater);  
	  
	    }  
	  
	    
	  
	    public TimelineEvent getEvent() {  
	        return event;  
	    }  
	  
	    public void setEvent(TimelineEvent event) {  
	        this.event = event;  
	    }  
	  
	    public long getZoomMax() {  
	        return zoomMax;  
	    }  
	  
	    public Date getStart() {  
	        return start;  
	    }  
	  
	    public Date getEnd() {  
	        return end;  
	    }  
	  
	    public TimeZone getTimeZone() {  
	        return timeZone;  
	    }  
	  
	  
	}
	            
