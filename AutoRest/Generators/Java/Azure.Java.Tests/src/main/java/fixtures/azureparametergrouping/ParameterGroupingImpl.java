/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.serializer.AzureJacksonHelper;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import fixtures.azureparametergrouping.models.Error;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

public class ParameterGroupingImpl implements ParameterGrouping {
    private ParameterGroupingService service;
    AutoRestParameterGroupingTestService client;

    public ParameterGroupingImpl(Retrofit retrofit, AutoRestParameterGroupingTestService client) {
        this.service = retrofit.create(ParameterGroupingService.class);
        this.client = client;
    }

    /**
     * Post a bunch of required parameters grouped
     *
     * @param path Path parameter
     * @param body the int value
     * @param customHeader the String value
     * @param query Query parameter with default
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postRequired(String path, int body, String customHeader, Integer query) throws ServiceException {
        if (path == null) {
            throw new ServiceException(
                new IllegalArgumentException("Parameter path is required and cannot be null."));
        }
        try {
            Call<ResponseBody> call = service.postRequired(path, body, customHeader, query, this.client.getAcceptLanguage());
            return postRequiredDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Post a bunch of required parameters grouped
     *
     * @param path Path parameter
     * @param body the int value
     * @param customHeader the String value
     * @param query Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postRequiredAsync(String path, int body, String customHeader, Integer query, final ServiceCallback<Void> serviceCallback) {
        if (path == null) {
            serviceCallback.failure(new ServiceException(
                new IllegalArgumentException("Parameter path is required and cannot be null.")));
        }
        Call<ResponseBody> call = service.postRequired(path, body, customHeader, query, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postRequiredDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postRequiredDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>(new AzureJacksonHelper())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param customHeader the String value
     * @param query Query parameter with default
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postOptional(String customHeader, Integer query) throws ServiceException {
        try {
            Call<ResponseBody> call = service.postOptional(customHeader, query, this.client.getAcceptLanguage());
            return postOptionalDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Post a bunch of optional parameters grouped
     *
     * @param customHeader the String value
     * @param query Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postOptionalAsync(String customHeader, Integer query, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.postOptional(customHeader, query, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postOptionalDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postOptionalDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>(new AzureJacksonHelper())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param headerOne the String value
     * @param queryOne Query parameter with default
     * @param headerTwo the String value
     * @param queryTwo Query parameter with default
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public ServiceResponse<Void> postMultipleParameterGroups(String headerOne, Integer queryOne, String headerTwo, Integer queryTwo) throws ServiceException {
        try {
            Call<ResponseBody> call = service.postMultipleParameterGroups(headerOne, queryOne, headerTwo, queryTwo, this.client.getAcceptLanguage());
            return postMultipleParameterGroupsDelegate(call.execute(), null);
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Post parameters from multiple different parameter groups
     *
     * @param headerOne the String value
     * @param queryOne Query parameter with default
     * @param headerTwo the String value
     * @param queryTwo Query parameter with default
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> postMultipleParameterGroupsAsync(String headerOne, Integer queryOne, String headerTwo, Integer queryTwo, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.postMultipleParameterGroups(headerOne, queryOne, headerTwo, queryTwo, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(postMultipleParameterGroupsDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> postMultipleParameterGroupsDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>(new AzureJacksonHelper())
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
