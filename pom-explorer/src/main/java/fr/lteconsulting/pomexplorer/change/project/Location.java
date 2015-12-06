package fr.lteconsulting.pomexplorer.change.project;

import fr.lteconsulting.pomexplorer.model.DependencyKey;
import fr.lteconsulting.pomexplorer.model.GroupArtifact;

public class Location
{
	static class Parent extends Location
	{
		@Override
		public String toString()
		{
			return "parent";
		}
	}

	static class Project extends Location
	{
		@Override
		public String toString()
		{
			return "project";
		}
	}

	static class Property extends Location
	{
		@Override
		public String toString()
		{
			return "property";
		}
	}

	static class Dependency extends Location
	{
		private final DependencyKey key;

		public Dependency( DependencyKey key )
		{
			assert key != null;
			this.key = key;
		}

		@Override
		public String toString()
		{
			return "dependency " + key;
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			return result;
		}

		@Override
		public boolean equals( Object obj )
		{
			if( this == obj )
				return true;
			if( obj == null )
				return false;
			if( getClass() != obj.getClass() )
				return false;
			Dependency other = (Dependency) obj;
			if( key == null )
			{
				if( other.key != null )
					return false;
			}
			else if( !key.equals( other.key ) )
				return false;
			return true;
		}

	}

	static class DependencyManagement extends Location
	{
		private final DependencyKey key;

		public DependencyManagement( DependencyKey key )
		{
			assert key != null;
			this.key = key;
		}

		@Override
		public String toString()
		{
			return "dependency management " + key;
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			return result;
		}

		@Override
		public boolean equals( Object obj )
		{
			if( this == obj )
				return true;
			if( obj == null )
				return false;
			if( getClass() != obj.getClass() )
				return false;
			DependencyManagement other = (DependencyManagement) obj;
			if( key == null )
			{
				if( other.key != null )
					return false;
			}
			else if( !key.equals( other.key ) )
				return false;
			return true;
		}

	}

	static class Plugin extends Location
	{
		private final GroupArtifact key;

		public Plugin( GroupArtifact key )
		{
			assert key != null;
			this.key = key;
		}

		@Override
		public String toString()
		{
			return "plugin " + key;
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			return result;
		}

		@Override
		public boolean equals( Object obj )
		{
			if( this == obj )
				return true;
			if( obj == null )
				return false;
			if( getClass() != obj.getClass() )
				return false;
			Plugin other = (Plugin) obj;
			if( key == null )
			{
				if( other.key != null )
					return false;
			}
			else if( !key.equals( other.key ) )
				return false;
			return true;
		}

	}

	static class PluginManagement extends Location
	{
		private final GroupArtifact key;

		public PluginManagement( GroupArtifact key )
		{
			assert key != null;
			this.key = key;
		}

		@Override
		public String toString()
		{
			return "plugin management " + key;
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
			return result;
		}

		@Override
		public boolean equals( Object obj )
		{
			if( this == obj )
				return true;
			if( obj == null )
				return false;
			if( getClass() != obj.getClass() )
				return false;
			PluginManagement other = (PluginManagement) obj;
			if( key == null )
			{
				if( other.key != null )
					return false;
			}
			else if( !key.equals( other.key ) )
				return false;
			return true;
		}

	}
}