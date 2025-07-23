/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package za.co.ntier.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

import au.blindmot.model.I_BLD_Product_PartType;

/** Generated Interface for ZZ_Woocommerce_Map_Line
 *  @author iDempiere (generated) 
 *  @version Release 9
 */
@SuppressWarnings("all")
public interface I_ZZ_Woocommerce_Map_Line 
{

    /** TableName=ZZ_Woocommerce_Map_Line */
    public static final String Table_Name = "ZZ_Woocommerce_Map_Line";

    /** AD_Table_ID=1000077 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

  
  
	/** Column name Add_To_Duplicate */
  //  public static final String COLUMNNAME_Add_To_Duplicate = "Add_To_Duplicate"; 

	/** Set Add_To_Duplicate	  */
//	public void setAdd_To_Duplicate (boolean Add_To_Duplicate);

	/** Get Add_To_Duplicate	  */
//	public boolean isAdd_To_Duplicate();
	


    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name BLD_Product_PartType_ID */
    public static final String COLUMNNAME_BLD_Product_PartType_ID = "BLD_Product_PartType_ID";

	/** Set Product PartType	  */
	public void setBLD_Product_PartType_ID (int BLD_Product_PartType_ID);

	/** Get Product PartType	  */
	public int getBLD_Product_PartType_ID();

	public I_BLD_Product_PartType getBLD_Product_PartType() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name M_Attribute_ID */
    public static final String COLUMNNAME_M_Attribute_ID = "M_Attribute_ID";

	/** Set Attribute.
	  * Product Attribute
	  */
	public void setM_Attribute_ID (int M_Attribute_ID);

	/** Get Attribute.
	  * Product Attribute
	  */
	public int getM_Attribute_ID();

	public org.compiere.model.I_M_Attribute getM_Attribute() throws RuntimeException;

    /** Column name M_Attribute_Product_ID */
    public static final String COLUMNNAME_M_Attribute_Product_ID = "M_Attribute_Product_ID";

	/** Set Idempiere product	  */
	public void setM_Attribute_Product_ID (int M_Attribute_Product_ID);

	/** Get Idempiere product	  */
	public int getM_Attribute_Product_ID();

	public org.compiere.model.I_M_Attribute getM_Attribute_Product() throws RuntimeException;

    /** Column name M_AttributeSetInstance_ID */
    public static final String COLUMNNAME_M_AttributeSetInstance_ID = "M_AttributeSetInstance_ID";

	/** Set Attribute Set Instance.
	  * Product Attribute Set Instance
	  */
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID);

	/** Get Attribute Set Instance.
	  * Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID();

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException;

    /** Column name M_AttributeValue_ID */
    public static final String COLUMNNAME_M_AttributeValue_ID = "M_AttributeValue_ID";

	/** Set Attribute Value.
	  * Product Attribute Value
	  */
	public void setM_AttributeValue_ID (int M_AttributeValue_ID);

	/** Get Attribute Value.
	  * Product Attribute Value
	  */
	public int getM_AttributeValue_ID();

	public org.compiere.model.I_M_AttributeValue getM_AttributeValue() throws RuntimeException;

    /** Column name M_Attributevalue_Product_ID */
    public static final String COLUMNNAME_M_Attributevalue_Product_ID = "M_Attributevalue_Product_ID";

	/** Set Idempiere product attribute	  */
	public void setM_Attributevalue_Product_ID (int M_Attributevalue_Product_ID);

	/** Get Idempiere product attribute	  */
	public int getM_Attributevalue_Product_ID();

	public org.compiere.model.I_M_AttributeValue getM_Attributevalue_Product() throws RuntimeException;

    /** Column name M_Product_Line_ID */
    public static final String COLUMNNAME_M_Product_Line_ID = "M_Product_Line_ID";

	/** Set M_Product_Line_ID	  */
	public void setM_Product_Line_ID (int M_Product_Line_ID);

	/** Get M_Product_Line_ID	  */
	public int getM_Product_Line_ID();

	public org.compiere.model.I_M_Product getM_Product_Line() throws RuntimeException;

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name ZZ_Woocommerce_Map_ID */
    public static final String COLUMNNAME_ZZ_Woocommerce_Map_ID = "ZZ_Woocommerce_Map_ID";

	/** Set Woocommerce Map	  */
	public void setZZ_Woocommerce_Map_ID (int ZZ_Woocommerce_Map_ID);

	/** Get Woocommerce Map	  */
	public int getZZ_Woocommerce_Map_ID();

	public I_ZZ_Woocommerce_Map getZZ_Woocommerce_Map() throws RuntimeException;

    /** Column name ZZ_Woocommerce_Map_Line_ID */
    public static final String COLUMNNAME_ZZ_Woocommerce_Map_Line_ID = "ZZ_Woocommerce_Map_Line_ID";

	/** Set Woocommerce Map Lines	  */
	public void setZZ_Woocommerce_Map_Line_ID (int ZZ_Woocommerce_Map_Line_ID);

	/** Get Woocommerce Map Lines	  */
	public int getZZ_Woocommerce_Map_Line_ID();

    /** Column name ZZ_Woocommerce_Map_Line_UU */
    public static final String COLUMNNAME_ZZ_Woocommerce_Map_Line_UU = "ZZ_Woocommerce_Map_Line_UU";

	/** Set ZZ_Woocommerce_Map_Line_UU	  */
	public void setZZ_Woocommerce_Map_Line_UU (String ZZ_Woocommerce_Map_Line_UU);

	/** Get ZZ_Woocommerce_Map_Line_UU	  */
	public String getZZ_Woocommerce_Map_Line_UU();

    /** Column name zz_woocommerce_map_type */
    public static final String COLUMNNAME_zz_woocommerce_map_type = "zz_woocommerce_map_type";

	/** Set Woocommerce Map Type	  */
	public void setzz_woocommerce_map_type (String zz_woocommerce_map_type);

	/** Get Woocommerce Map Type	  */
	public String getzz_woocommerce_map_type();
}
