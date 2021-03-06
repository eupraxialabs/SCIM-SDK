package de.captaingoldfish.scim.sdk.server.schemas.custom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import de.captaingoldfish.scim.sdk.common.constants.AttributeNames;
import de.captaingoldfish.scim.sdk.common.resources.base.ScimObjectNode;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;


/**
 * author Pascal Knueppel <br>
 * created at: 26.11.2019 - 15:17 <br>
 * <br>
 */
@Slf4j
@NoArgsConstructor
public class ResourceTypeAuthorization extends ScimObjectNode
{

  @Builder
  public ResourceTypeAuthorization(Set<String> roles,
                                   Set<String> rolesCreate,
                                   Set<String> rolesGet,
                                   Set<String> rolesUpdate,
                                   Set<String> rolesDelete)
  {
    this();
    setRoles(roles);
    setRolesCreate(rolesCreate);
    setRolesGet(rolesGet);
    setRolesUpdate(rolesUpdate);
    setRolesDelete(rolesDelete);
  }

  /**
   * the roles the client must have to access the resource endpoint. This setting defines the roles necessary
   * for all endpoints [create, get, list, update, patch, delete]. This setting may be overridden by other
   * attributes
   */
  public Set<String> getRoles()
  {
    return getSimpleArrayAttributeSet(AttributeNames.Custom.ROLES);
  }

  /**
   * the roles the client must have to access the resource endpoint. This setting defines the roles necessary
   * for all endpoints [create, get, list, update, patch, delete]. This setting may be overridden by other
   * attributes
   */
  public void setRoles(Set<String> roles)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES, roles);
  }

  /**
   * the roles the client must have to access the resource endpoint. This setting defines the roles necessary
   * for all endpoints [create, get, list, update, patch, delete]. This setting may be overridden by other
   * attributes
   */
  public void setRoles(String... roles)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES, new HashSet<>(Arrays.asList(roles)));
  }

  /**
   * the roles the client must have to access the create endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the create endpoint only)
   */
  public Set<String> getRolesCreate()
  {
    Set<String> rolesCreate = getSimpleArrayAttributeSet(AttributeNames.Custom.ROLES_CREATE);
    if (rolesCreate.isEmpty())
    {
      rolesCreate = getRoles();
    }
    return rolesCreate;
  }

  /**
   * the roles the client must have to access the create endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the create endpoint only)
   */
  public void setRolesCreate(Set<String> rolesCreate)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_CREATE, rolesCreate);
  }

  /**
   * the roles the client must have to access the create endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the create endpoint only)
   */
  public void setRolesCreate(String... rolesCreate)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_CREATE, new HashSet<>(Arrays.asList(rolesCreate)));
  }

  /**
   * the roles the client must have to access the get endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the get endpoint only)
   */
  public Set<String> getRolesGet()
  {
    Set<String> rolesGet = getSimpleArrayAttributeSet(AttributeNames.Custom.ROLES_GET);
    if (rolesGet.isEmpty())
    {
      rolesGet = getRoles();
    }
    return rolesGet;
  }

  /**
   * the roles the client must have to access the get endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the get endpoint only)
   */
  public void setRolesGet(Set<String> rolesGet)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_GET, rolesGet);
  }

  /**
   * the roles the client must have to access the get endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the get endpoint only)
   */
  public void setRolesGet(String... rolesGet)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_GET, new HashSet<>(Arrays.asList(rolesGet)));
  }

  /**
   * the roles the client must have to access the update endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the update endpoint only)
   */
  public Set<String> getRolesUpdate()
  {
    Set<String> rolesUpdate = getSimpleArrayAttributeSet(AttributeNames.Custom.ROLES_UPDATE);
    if (rolesUpdate.isEmpty())
    {
      rolesUpdate = getRoles();
    }
    return rolesUpdate;
  }

  /**
   * the roles the client must have to access the update endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the update endpoint only)
   */
  public void setRolesUpdate(String... rolesUpdate)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_UPDATE, new HashSet<>(Arrays.asList(rolesUpdate)));
  }

  /**
   * the roles the client must have to access the update endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the update endpoint only)
   */
  public void setRolesUpdate(Set<String> rolesUpdate)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_UPDATE, rolesUpdate);
  }

  /**
   * the roles the client must have to access the delete endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the delete endpoint only)
   */
  public Set<String> getRolesDelete()
  {
    Set<String> rolesDelete = getSimpleArrayAttributeSet(AttributeNames.Custom.ROLES_DELETE);
    if (rolesDelete.isEmpty())
    {
      rolesDelete = getRoles();
    }
    return rolesDelete;
  }

  /**
   * the roles the client must have to access the delete endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the delete endpoint only)
   */
  public void setRolesDelete(Set<String> rolesDelete)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_DELETE, rolesDelete);
  }

  /**
   * the roles the client must have to access the delete endpoint.(overrides the attribute "{@link #getRoles()}"
   * for the delete endpoint only)
   */
  public void setRolesDelete(String... rolesDelete)
  {
    setStringAttributeList(AttributeNames.Custom.ROLES_DELETE, new HashSet<>(Arrays.asList(rolesDelete)));
  }
}
