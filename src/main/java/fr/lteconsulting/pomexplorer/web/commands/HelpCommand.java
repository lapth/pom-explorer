package fr.lteconsulting.pomexplorer.web.commands;

import fr.lteconsulting.pomexplorer.Client;

public class HelpCommand extends BaseCommand
{
	public HelpCommand()
	{
		super("help", "?");
	}

	@Override
	public String execute(Client client, String[] params)
	{
		StringBuilder sb = new StringBuilder();

		sb.append( "<table border='0' style='color:white;'>" );
		
		sb.append( "<tr><td><b>Command</b></td><td><b>Shortcut(s)</b></td></tr>" );
		
		for (Command c : CommandList.getCommands())
		{
			sb.append( "<tr><td>" );

			sb.append(c.getName());

			sb.append("</td><td>");
			
			String sep2 = "";
			for (String shortcut : c.getShortcuts())
			{
				sb.append(sep2);
				sep2 = ", ";
				sb.append("'" + shortcut + "'");
			}
			
			sb.append( "</td></tr>" );
		}
		
		sb.append( "</table>" );

		return sb.toString();
	}
}
