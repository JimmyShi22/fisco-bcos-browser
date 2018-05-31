/*
 * This file is part of FISCO BCOS Browser.
 *
 * FISCO BCOS Browser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FISCO BCOS Browser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FISCO BCOS Browser.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * @file: ReqGetTbNodeConnectionByPageVO.java
 * @author: v_wbsqwu
 * @date: 2018
 */

package org.bcos.browser.entity.req;

import org.bcos.browser.entity.base.BasePageReqEntity;

public class ReqGetTbNodeConnectionByPageVO extends BasePageReqEntity {
    private String ipVal;//ip
    private String rpcPortVal;

    public String getIpVal() {
        return ipVal;
    }

    public void setIpVal(String ipVal) {
        this.ipVal = ipVal;
    }

    public String getRpcPortVal() {
        return rpcPortVal;
    }

    public void setRpcPortVal(String rpcPortVal) {
        this.rpcPortVal = rpcPortVal;
    }
}
