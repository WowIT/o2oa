package com.x.processplatform.assemble.designer;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.exception.ExceptionWhen;
import com.x.base.core.http.EffectivePerson;
import com.x.base.core.role.RoleDefinition;
import com.x.organization.core.express.Organization;
import com.x.processplatform.assemble.designer.content.factory.AttachmentFactory;
import com.x.processplatform.assemble.designer.content.factory.DataItemFactory;
import com.x.processplatform.assemble.designer.content.factory.ReadCompletedFactory;
import com.x.processplatform.assemble.designer.content.factory.ReadFactory;
import com.x.processplatform.assemble.designer.content.factory.ReviewFactory;
import com.x.processplatform.assemble.designer.content.factory.SerialNumberFactory;
import com.x.processplatform.assemble.designer.content.factory.TaskCompletedFactory;
import com.x.processplatform.assemble.designer.content.factory.TaskFactory;
import com.x.processplatform.assemble.designer.content.factory.WorkCompletedFactory;
import com.x.processplatform.assemble.designer.content.factory.WorkFactory;
import com.x.processplatform.assemble.designer.content.factory.WorkLogFactory;
import com.x.processplatform.assemble.designer.element.factory.AgentFactory;
import com.x.processplatform.assemble.designer.element.factory.ApplicationDictFactory;
import com.x.processplatform.assemble.designer.element.factory.ApplicationDictItemFactory;
import com.x.processplatform.assemble.designer.element.factory.ApplicationFactory;
import com.x.processplatform.assemble.designer.element.factory.BeginFactory;
import com.x.processplatform.assemble.designer.element.factory.CancelFactory;
import com.x.processplatform.assemble.designer.element.factory.ChoiceFactory;
import com.x.processplatform.assemble.designer.element.factory.DelayFactory;
import com.x.processplatform.assemble.designer.element.factory.EmbedFactory;
import com.x.processplatform.assemble.designer.element.factory.EndFactory;
import com.x.processplatform.assemble.designer.element.factory.FormFactory;
import com.x.processplatform.assemble.designer.element.factory.InvokeFactory;
import com.x.processplatform.assemble.designer.element.factory.ManualFactory;
import com.x.processplatform.assemble.designer.element.factory.MergeFactory;
import com.x.processplatform.assemble.designer.element.factory.MessageFactory;
import com.x.processplatform.assemble.designer.element.factory.ParallelFactory;
import com.x.processplatform.assemble.designer.element.factory.ProcessFactory;
import com.x.processplatform.assemble.designer.element.factory.QueryStatFactory;
import com.x.processplatform.assemble.designer.element.factory.QueryViewFactory;
import com.x.processplatform.assemble.designer.element.factory.RouteFactory;
import com.x.processplatform.assemble.designer.element.factory.ScriptFactory;
import com.x.processplatform.assemble.designer.element.factory.ServiceFactory;
import com.x.processplatform.assemble.designer.element.factory.SplitFactory;
import com.x.processplatform.core.entity.element.Application;

public class Business {

	private EntityManagerContainer emc;

	public Business(EntityManagerContainer emc) throws Exception {
		this.emc = emc;
	}

	public EntityManagerContainer entityManagerContainer() {
		return this.emc;
	}

	private ApplicationDictFactory applicationDict;

	public ApplicationDictFactory applicationDict() throws Exception {
		if (null == this.applicationDict) {
			this.applicationDict = new ApplicationDictFactory(this);
		}
		return applicationDict;
	}

	private ApplicationDictItemFactory applicationDictItem;

	public ApplicationDictItemFactory applicationDictItem() throws Exception {
		if (null == this.applicationDictItem) {
			this.applicationDictItem = new ApplicationDictItemFactory(this);
		}
		return applicationDictItem;
	}

	private ScriptFactory script;

	public ScriptFactory script() throws Exception {
		if (null == this.script) {
			this.script = new ScriptFactory(this);
		}
		return script;
	}

	private FormFactory form;

	public FormFactory form() throws Exception {
		if (null == this.form) {
			this.form = new FormFactory(this);
		}
		return form;
	}

	private QueryViewFactory queryView;

	public QueryViewFactory queryView() throws Exception {
		if (null == this.queryView) {
			this.queryView = new QueryViewFactory(this);
		}
		return queryView;
	}

	private QueryStatFactory queryStat;

	public QueryStatFactory queryStat() throws Exception {
		if (null == this.queryStat) {
			this.queryStat = new QueryStatFactory(this);
		}
		return queryStat;
	}

	private ApplicationFactory application;

	public ApplicationFactory application() throws Exception {
		if (null == this.application) {
			this.application = new ApplicationFactory(this);
		}
		return application;
	}

	private ProcessFactory process;

	public ProcessFactory process() throws Exception {
		if (null == this.process) {
			this.process = new ProcessFactory(this);
		}
		return process;
	}

	private AgentFactory agent;

	public AgentFactory agent() throws Exception {
		if (null == this.agent) {
			this.agent = new AgentFactory(this);
		}
		return agent;
	}

	private BeginFactory begin;

	public BeginFactory begin() throws Exception {
		if (null == this.begin) {
			this.begin = new BeginFactory(this);
		}
		return begin;
	}

	private CancelFactory cancel;

	public CancelFactory cancel() throws Exception {
		if (null == this.cancel) {
			this.cancel = new CancelFactory(this);
		}
		return cancel;
	}

	private ChoiceFactory choice;

	public ChoiceFactory choice() throws Exception {
		if (null == this.choice) {
			this.choice = new ChoiceFactory(this);
		}
		return choice;
	}

	private DelayFactory delay;

	public DelayFactory delay() throws Exception {
		if (null == this.delay) {
			this.delay = new DelayFactory(this);
		}
		return delay;
	}

	private EmbedFactory embed;

	public EmbedFactory embed() throws Exception {
		if (null == this.embed) {
			this.embed = new EmbedFactory(this);
		}
		return embed;
	}

	private EndFactory end;

	public EndFactory end() throws Exception {
		if (null == this.end) {
			this.end = new EndFactory(this);
		}
		return end;
	}

	private InvokeFactory invoke;

	public InvokeFactory invoke() throws Exception {
		if (null == this.invoke) {
			this.invoke = new InvokeFactory(this);
		}
		return invoke;
	}

	private ManualFactory manual;

	public ManualFactory manual() throws Exception {
		if (null == this.manual) {
			this.manual = new ManualFactory(this);
		}
		return manual;
	}

	private MergeFactory merge;

	public MergeFactory merge() throws Exception {
		if (null == this.merge) {
			this.merge = new MergeFactory(this);
		}
		return merge;
	}

	private MessageFactory message;

	public MessageFactory message() throws Exception {
		if (null == this.message) {
			this.message = new MessageFactory(this);
		}
		return message;
	}

	private ParallelFactory parallel;

	public ParallelFactory parallel() throws Exception {
		if (null == this.parallel) {
			this.parallel = new ParallelFactory(this);
		}
		return parallel;
	}

	private ServiceFactory service;

	public ServiceFactory service() throws Exception {
		if (null == this.service) {
			this.service = new ServiceFactory(this);
		}
		return service;
	}

	private SplitFactory split;

	public SplitFactory split() throws Exception {
		if (null == this.split) {
			this.split = new SplitFactory(this);
		}
		return split;
	}

	private RouteFactory route;

	public RouteFactory route() throws Exception {
		if (null == this.route) {
			this.route = new RouteFactory(this);
		}
		return route;
	}

	private Organization organization;

	public Organization organization() throws Exception {
		if (null == this.organization) {
			this.organization = new Organization();
		}
		return organization;
	}

	private AttachmentFactory attachment;

	public AttachmentFactory attachment() throws Exception {
		if (null == this.attachment) {
			this.attachment = new AttachmentFactory(this);
		}
		return attachment;
	}

	// private AttachmentLogFactory attachmentLog;
	//
	// public AttachmentLogFactory attachmentLog() throws Exception {
	// if (null == this.attachmentLog) {
	// this.attachmentLog = new AttachmentLogFactory(this);
	// }
	// return attachmentLog;
	// }

	private DataItemFactory dataItem;

	public DataItemFactory dataItem() throws Exception {
		if (null == this.dataItem) {
			this.dataItem = new DataItemFactory(this);
		}
		return dataItem;
	}

	private TaskFactory task;

	public TaskFactory task() throws Exception {
		if (null == this.task) {
			this.task = new TaskFactory(this);
		}
		return task;
	}

	private TaskCompletedFactory taskCompleted;

	public TaskCompletedFactory taskCompleted() throws Exception {
		if (null == this.taskCompleted) {
			this.taskCompleted = new TaskCompletedFactory(this);
		}
		return taskCompleted;
	}

	private ReadFactory read;

	public ReadFactory read() throws Exception {
		if (null == this.read) {
			this.read = new ReadFactory(this);
		}
		return read;
	}

	private ReadCompletedFactory readCompleted;

	public ReadCompletedFactory readCompleted() throws Exception {
		if (null == this.readCompleted) {
			this.readCompleted = new ReadCompletedFactory(this);
		}
		return readCompleted;
	}

	private ReviewFactory review;

	public ReviewFactory review() throws Exception {
		if (null == this.review) {
			this.review = new ReviewFactory(this);
		}
		return review;
	}

	private SerialNumberFactory serialNumber;

	public SerialNumberFactory serialNumber() throws Exception {
		if (null == this.serialNumber) {
			this.serialNumber = new SerialNumberFactory(this);
		}
		return serialNumber;
	}

	private WorkFactory work;

	public WorkFactory work() throws Exception {
		if (null == this.work) {
			this.work = new WorkFactory(this);
		}
		return work;
	}

	private WorkCompletedFactory workCompleted;

	public WorkCompletedFactory workCompleted() throws Exception {
		if (null == this.workCompleted) {
			this.workCompleted = new WorkCompletedFactory(this);
		}
		return workCompleted;
	}

	private WorkLogFactory workLog;

	public WorkLogFactory workLog() throws Exception {
		if (null == this.workLog) {
			this.workLog = new WorkLogFactory(this);
		}
		return workLog;
	}

	public boolean applicationEditAvailable(EffectivePerson effectivePerson, Application application,
			ExceptionWhen exceptionWhen) throws Exception {
		boolean result = false;
		if ((StringUtils.equals(application.getCreatorPerson(), effectivePerson.getName()))
				|| (application.getControllerList().contains(effectivePerson.getName())) || effectivePerson.isManager()
				|| organization().role().hasAny(effectivePerson.getName(), RoleDefinition.ProcessPlatformManager)) {
			result = true;
		}
		if (Objects.equals(ExceptionWhen.not_allow, exceptionWhen)) {
			if (!result) {
				throw new Exception("person{name:" + effectivePerson.getName() + "} access application{id:"
						+ application.getId() + "} was denied.");
			}
		}
		return result;
	}
}