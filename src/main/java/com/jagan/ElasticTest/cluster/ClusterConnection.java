package com.jagan.ElasticTest.cluster;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.NodeBuilder;

public class ClusterConnection {

	private Client client;

	public ClusterConnection() {
		
		setClient(NodeBuilder.nodeBuilder()
				.settings(Settings.settingsBuilder().put("path.home", "/path/to/elasticsearch/home/dir")).node()
				.client());
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
