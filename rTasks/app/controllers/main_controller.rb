class MainController < ApplicationController
  def index
    redirect_to "#{ActionController::Base.relative_url_root}/index.jsp"
  end

end
