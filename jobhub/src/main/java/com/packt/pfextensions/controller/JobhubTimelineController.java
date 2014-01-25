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

	private boolean selectable = true;
	private boolean zoomable = true;
	private boolean moveable = true;
	private boolean stackEvents = true;
	private String eventStyle = "box";
	private boolean axisOnTop;
	private boolean showCurrentTime = true;
	private boolean showNavigation = false;

	private TimelineModel model;
	private TimelineEvent event;
	private long zoomMax;
	private Date start;
	private Date end;
	private TimeZone timeZone = TimeZone.getTimeZone("Europe/Madrid");

	@PostConstruct
	protected void initialize() {
		zoomMax = 1000L * 60 * 60 * 24 * 30;
		model = new TimelineModel();

		Calendar cal = Calendar.getInstance();
		cal.set(2011, Calendar.MAY, 10, 0, 0, 0);
		Date start = cal.getTime();
		cal.set(2011, Calendar.MAY, 15, 0, 0, 0);
		Date end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("10000", "500", "2000000"),
				start, end));

		cal.set(2012, Calendar.JANUARY, 23, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.JANUARY, 28, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("7000", "700", "540000"), start,
				end));

		cal.set(2012, Calendar.APRIL, 2, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.APRIL, 7, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("8000", "590", "2300000"),
				start, end));

		cal.set(2012, Calendar.APRIL, 16, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.APRIL, 21, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("1000", "500", "8800000"),
				start, end));

		cal.set(2012, Calendar.MAY, 4, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.MAY, 9, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("100", "590", "23000"), start,
				end));

		cal.set(2012, Calendar.MAY, 10, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.MAY, 15, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("200", "500", "8800"), start,
				end));

		cal.set(2012, Calendar.MAY, 15, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.MAY, 20, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("200", "590", "2300"), start,
				end));

		cal.set(2012, Calendar.MAY, 21, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.MAY, 26, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("300", "500", "800"), start, end));

		cal.set(2012, Calendar.MAY, 26, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.MAY, 31, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("200", "500", "8800"), start,
				end));

		cal.set(2012, Calendar.JUNE, 5, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.JUNE, 10, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("10300", "500", "2000000"),
				start, end));

		cal.set(2012, Calendar.JUNE, 10, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.JUNE, 15, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("60000", "500", "3300000"),
				start, end));

		cal.set(2012, Calendar.JUNE, 15, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.AUGUST, 20, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("10300", "500", "2000000"),
				start, end));

		cal.set(2012, Calendar.JUNE, 19, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.JULY, 24, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("60000", "500", "3300000"),
				start, end));

		cal.set(2012, Calendar.SEPTEMBER, 26, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.SEPTEMBER, 31, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("34000", "700", "6000000"),
				start, end));

		cal.set(2012, Calendar.OCTOBER, 13, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.OCTOBER, 18, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("15500", "700", "2000000"),
				start, end));

		cal.set(2012, Calendar.DECEMBER, 16, 0, 0, 0);
		start = cal.getTime();
		cal.set(2012, Calendar.DECEMBER, 21, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("23000", "600", "2300000"),
				start, end));

		cal.set(2013, Calendar.FEBRUARY, 3, 0, 0, 0);
		start = cal.getTime();
		cal.set(2013, Calendar.FEBRUARY, 8, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("23000", "500", "233000"),
				start, end));

		cal.set(2013, Calendar.MAY, 4, 0, 0, 0);
		start = cal.getTime();
		cal.set(2013, Calendar.MAY, 9, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("55000", "500", "2330000"),
				start, end));

		cal.set(2013, Calendar.JUNE, 5, 0, 0, 0);
		start = cal.getTime();
		cal.set(2013, Calendar.JUNE, 10, 0, 0, 0);
		end = cal.getTime();

		model.add(new TimelineEvent(new Jobhub("222000", "2300", "23230000"),
				start, end));
	}

	public void onChange(TimelineModificationEvent e) {
		event = e.getTimelineEvent();
		model.update(event);
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"The Post details of posts count " + getJobhubPosts()
						+ " have been updated", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void onEdit(TimelineModificationEvent e) {
		event = e.getTimelineEvent();
	}

	public void onAdd(TimelineAddEvent e) {
		event = new TimelineEvent(new Jobhub(), e.getStartDate(),
				e.getEndDate(), true, e.getGroup());
		model.add(event);
	}

	public void onDelete(TimelineModificationEvent e) {
		event = e.getTimelineEvent();
	}

	public void delete() {
		TimelineUpdater timelineUpdater = TimelineUpdater
				.getCurrentInstance(":adminForm:tabView:timeline");
		model.delete(event, timelineUpdater);

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"The posts details of posts count  " + getJobhubPosts()
						+ " has been deleted", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void saveDetails() {
		TimelineUpdater timelineUpdater = TimelineUpdater
				.getCurrentInstance(":adminForm:tabView:timeline");
		model.update(event, timelineUpdater);

		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"The posts details of posts count " + getJobhubPosts()
						+ " have been saved", null);
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getDeleteMessage() {
		String posts = ((Jobhub) event.getData()).getNoofposts();
		if (posts == null) {
			return "Do you really want to delete the jobhub event?";
		}

		return "Do you really want to delete the jobhub event for the posts count "
				+ posts + "?";
	}

	public String getJobhubPosts() {
		String posts = ((Jobhub) event.getData()).getNoofposts();
		if (posts == null) {
			return "(new jobhub event)";
		} else {
			return "(posts " + posts + ")";
		}
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
