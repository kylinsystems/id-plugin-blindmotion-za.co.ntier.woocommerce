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

/** Generated Interface for ZZ_Woocommerce_Map
 *  @author iDempiere (generated) 
 *  @version Release 9
 */
@SuppressWarnings("all")
public interface I_ZZ_Woocommerce_Map 
{

    /** TableName=ZZ_Woocommerce_Map */
    public static final String Table_Name = "ZZ_Woocommerce_Map";

    /** AD_Table_ID=1000076 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";
    
    public static final String COLUMNNAME_Add_To_Duplicate = "add_to_duplicate";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

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

    /** Column name ignore_no_child_records */
    public static final String COLUMNNAME_ignore_no_child_records = "ignore_no_child_records";

	/** Set Ignore No Child Records.
	  * Tells the system that a record without mapping lines (child records) is OK.
	  */
	public void setignore_no_child_records (boolean ignore_no_child_records);

	/** Get Ignore No Child Records.
	  * Tells the system that a record without mapping lines (child records) is OK.
	  */
	public boolean isignore_no_child_records();

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

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

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

    /** Column name woocommerce_field_key */
    public static final String COLUMNNAME_woocommerce_field_key = "woocommerce_field_key";

	/** Set woocommerce_field_key	  */
	public void setwoocommerce_field_key (String woocommerce_field_key);

	/** Get woocommerce_field_key	  */
	public String getwoocommerce_field_key();

    /** Column name woocommerce_field_label */
    public static final String COLUMNNAME_woocommerce_field_label = "woocommerce_field_label";

	/** Set woocommerce_field_label	  */
	public void setwoocommerce_field_label (String woocommerce_field_label);

	/** Get woocommerce_field_label	  */
	public String getwoocommerce_field_label();

    /** Column name woocommerce_field_value */
    public static final String COLUMNNAME_woocommerce_field_value = "woocommerce_field_value";

	/** Set woocommerce_field_value	  */
	public void setwoocommerce_field_value (String woocommerce_field_value);

	/** Get woocommerce_field_value	  */
	public String getwoocommerce_field_value();

    /** Column name ZZ_Woocommerce_Map_ID */
    public static final String COLUMNNAME_ZZ_Woocommerce_Map_ID = "ZZ_Woocommerce_Map_ID";

	/** Set Woocommerce Map	  */
	public void setZZ_Woocommerce_Map_ID (int ZZ_Woocommerce_Map_ID);

	/** Get Woocommerce Map	  */
	public int getZZ_Woocommerce_Map_ID();

    /** Column name ZZ_Woocommerce_Map_UU */
    public static final String COLUMNNAME_ZZ_Woocommerce_Map_UU = "ZZ_Woocommerce_Map_UU";

	/** Set ZZ_Woocommerce_Map_UU	  */
	public void setZZ_Woocommerce_Map_UU (String ZZ_Woocommerce_Map_UU);

	/** Get ZZ_Woocommerce_Map_UU	  */
	public String getZZ_Woocommerce_Map_UU();

    /** Column name zz_woocommerce_multi_select_ty */
    public static final String COLUMNNAME_zz_woocommerce_m_select_type = "zz_woocommerce_m_select_type";

	/** Set zz_woocommerce_multi_select_type	  */
	public void setzz_woocommerce_m_select_type (String zz_woocommerce_multi_select_ty);

	/** Get zz_woocommerce_multi_select_type	  */
	public String getzz_woocommerce_m_select_type();
}
